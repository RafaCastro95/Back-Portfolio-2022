package com.portfolio.castrorafael.controller;


import com.portfolio.castrorafael.dto.ExperienciaDto;
import com.portfolio.castrorafael.dto.Mensaje;

import com.portfolio.castrorafael.model.Experiencia;
import com.portfolio.castrorafael.service.ExperienciaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin(origins = "https://proyectofrontend-dc1c5.web.app")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }


    @GetMapping("/todas")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencias=experienciaService.buscarExperiencias();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia editarExperiencia=experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(editarExperiencia, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody ExperienciaDto experienciaDto){
        Experiencia experiencia = new Experiencia(
                experienciaDto.getTituloExp(),
                experienciaDto.getFechaExp(),
                experienciaDto.getDescExp());
        experienciaService.addExperiencia(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia añadida"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") int id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
