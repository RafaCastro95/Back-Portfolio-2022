package com.portfolio.castrorafael.service;

import com.portfolio.castrorafael.model.Educacion;
import com.portfolio.castrorafael.model.Trabajo;
import com.portfolio.castrorafael.repository.TrabajoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TrabajoService {
    private final TrabajoRepo trabajoRepo;

    @Autowired
    public TrabajoService(TrabajoRepo trabajoRepo) {
        this.trabajoRepo = trabajoRepo;
    }
    public Trabajo addTrabajo(Trabajo trabajo){
        return trabajoRepo.save(trabajo);
    }
    public List<Trabajo> buscarTrabajos(){
        return trabajoRepo.findAll();
    }
    public Trabajo editarTrabajo (Trabajo trabajo){
        return trabajoRepo.save(trabajo);
    }


    public void borrarTrabajo(int id){
        trabajoRepo.deleteById(id);
    }
}
