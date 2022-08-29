package com.portfolio.castrorafael.controller;

import com.portfolio.castrorafael.dto.EducacionDto;
import com.portfolio.castrorafael.dto.Mensaje;
import com.portfolio.castrorafael.model.Educacion;
import com.portfolio.castrorafael.service.EducacionService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educacion")
@CrossOrigin(origins = "https://proyectofrontend-dc1c5.web.app")

public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService){
        this.educacionService= educacionService;
    }
    @GetMapping("/todas")
    public ResponseEntity<List<Educacion>> educacion(){
        List<Educacion> educaciones=educacionService.buscarEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    @PutMapping("/editar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion editarEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(editarEducacion, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto){
        Educacion educacion = new Educacion(
                educacionDto.getTituloEdu(),
                educacionDto.getFechaEdu(),
                educacionDto.getDescEdu(),
                educacionDto.getImagenEdu());
                educacionService.addEducacion(educacion);
        return new ResponseEntity<>(new Mensaje("Educacion añadida"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") int id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
