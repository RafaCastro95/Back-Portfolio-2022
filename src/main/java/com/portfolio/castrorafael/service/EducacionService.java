package com.portfolio.castrorafael.service;
import com.portfolio.castrorafael.model.Educacion;
import com.portfolio.castrorafael.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }


    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void borrarEducacion(int id){
         educacionRepo.deleteById(id);
    }



}
