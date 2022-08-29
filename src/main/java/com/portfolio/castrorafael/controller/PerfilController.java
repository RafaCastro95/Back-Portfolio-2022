package com.portfolio.castrorafael.controller;

import com.portfolio.castrorafael.model.Perfil;
import com.portfolio.castrorafael.service.PerfilService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/perfil")
@CrossOrigin(origins = "https://proyectofrontend-dc1c5.web.app")
public class PerfilController {
    private final PerfilService perfilService;


    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Perfil> obtenerPerfil(@PathVariable("id") Long id){
        Perfil perfil = perfilService.buscarPerfilPorId(id);
        return new ResponseEntity<>(perfil, HttpStatus.OK);
    }


    @PutMapping("/editar")
    public ResponseEntity<Perfil> editarPerfil(@RequestBody Perfil perfil){
        Perfil editarPerfil = perfilService.editarPerfil(perfil);
        return new ResponseEntity<>(editarPerfil,HttpStatus.OK);
    }


    @PostMapping("/crear")
    public ResponseEntity<Perfil> crearPerfil(@RequestBody Perfil perfil){
        Perfil nuevoPerfil = perfilService.addPerfil(perfil);
        return new ResponseEntity<>(nuevoPerfil, HttpStatus.CREATED);
    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarPerfil(@PathVariable("id") Long id){
        perfilService.borrarPerfil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
