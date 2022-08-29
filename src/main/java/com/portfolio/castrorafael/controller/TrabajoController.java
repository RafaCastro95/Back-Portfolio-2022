package com.portfolio.castrorafael.controller;


import com.portfolio.castrorafael.dto.Mensaje;
import com.portfolio.castrorafael.dto.TrabajoDto;

import com.portfolio.castrorafael.model.Trabajo;
import com.portfolio.castrorafael.service.TrabajoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/trabajo")
@CrossOrigin(origins = "https://proyectofrontend-dc1c5.web.app")
public class TrabajoController {
    private final TrabajoService trabajoService;

    public TrabajoController(TrabajoService trabajoService) {
        this.trabajoService = trabajoService;
    }
    @GetMapping("/todas")
    public ResponseEntity<List<Trabajo>> obtenerTrabajo(){
        List<Trabajo> trabajos =trabajoService.buscarTrabajos();
        return new ResponseEntity<>(trabajos, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Trabajo> editarTrabajo(@RequestBody Trabajo trabajo){
        Trabajo editarTrabajo = trabajoService.editarTrabajo(trabajo);
        return new ResponseEntity<>(editarTrabajo, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody TrabajoDto trabajoDto){
        Trabajo trabajo = new Trabajo(
                trabajoDto.getNombrePro(),trabajoDto.getDescPro(),trabajoDto.getImagenPro());
        trabajoService.addTrabajo(trabajo);
        return new ResponseEntity(new Mensaje("Proyecto añadido"), HttpStatus.OK);
    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarTrabajo(@PathVariable("id") int id){
        trabajoService.borrarTrabajo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
