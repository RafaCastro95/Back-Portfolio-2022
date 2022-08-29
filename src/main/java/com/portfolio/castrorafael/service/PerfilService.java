package com.portfolio.castrorafael.service;


import com.portfolio.castrorafael.exception.UserNotFoundException;
import com.portfolio.castrorafael.model.Perfil;
import com.portfolio.castrorafael.repository.PerfilRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PerfilService {
    private final PerfilRepo perfilRepo;
    @Autowired
    public PerfilService(PerfilRepo perfilRepo) {
        this.perfilRepo = perfilRepo;
    }
    public Perfil addPerfil(Perfil perfil){
        return perfilRepo.save(perfil);
    }
    public List<Perfil> buscarPerfil(){
        return perfilRepo.findAll();
    }
    public Perfil editarPerfil (Perfil perfil){
        return perfilRepo.save(perfil);
    }
    public void borrarPerfil(Long id){
        perfilRepo.deleteById(id);
    }
    public Perfil buscarPerfilPorId(Long id){
        return perfilRepo.findById(id).orElseThrow(() ->new UserNotFoundException("persona no encontrado"));
    }
}
