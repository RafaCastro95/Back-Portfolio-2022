package com.portfolio.castrorafael.service;



import com.portfolio.castrorafael.model.Educacion;
import com.portfolio.castrorafael.model.Skill;
import com.portfolio.castrorafael.repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class SkillService {
    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }



    public Optional<Skill> getOne(int id){
        return skillRepo.findById(id);
    }

    public Optional<Skill> getByNombre(String nombreSkill){
        return skillRepo.findByNombreSkill(nombreSkill);
    }

    public boolean existsById(int id){
        return skillRepo.existsById(id);
    }

    public void save(Skill skill){
        skillRepo.save(skill);
    }

    public boolean existsByNombre(String nombreSkill){
        return skillRepo.existsByNombreSkill(nombreSkill);
    }
    public Skill addSkill(Skill skill){
        return skillRepo.save(skill);
    }
    public List<Skill> buscarSkills(){
        return skillRepo.findAll();
    }
    public Skill editarSkills (Skill skill){
        return skillRepo.save(skill);
    }


    public void borrarSkills(int id){
        skillRepo.deleteById(id);
    }
}
