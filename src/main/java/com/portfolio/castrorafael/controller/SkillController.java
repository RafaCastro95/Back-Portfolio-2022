package com.portfolio.castrorafael.controller;


import com.portfolio.castrorafael.dto.Mensaje;
import com.portfolio.castrorafael.dto.SkillDto;


import com.portfolio.castrorafael.model.Skill;
import com.portfolio.castrorafael.service.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins = "https://proyectofrontend-dc1c5.web.app")
public class SkillController {


    private final SkillService skillService;


    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/todas")
    public ResponseEntity<List<Skill>> obtenerSkills(){
        List<Skill> skills= skillService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Skill> getById (@PathVariable("id") int id){
        if(!skillService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Skill skill = skillService.getOne(id).get();
        return new ResponseEntity(skill, HttpStatus.OK);
    }


    @PostMapping("/crear")
    public ResponseEntity<?> create (@RequestBody SkillDto skillDto){
        Skill skill = new Skill(
                skillDto.getNombreSkill(),skillDto.getPorcentaje(),skillDto.getImagenSkill());
        skillService.addSkill(skill);
        return new ResponseEntity(new Mensaje("Aptitud añadida"), HttpStatus.OK);
    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") int id){
        skillService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping("/editar")
    public ResponseEntity<?> editarSkill( @RequestBody Skill skill){
        Skill editarSkill = skillService.editarSkills(skill);
        return new ResponseEntity<>(editarSkill, HttpStatus.OK);
    }

}
