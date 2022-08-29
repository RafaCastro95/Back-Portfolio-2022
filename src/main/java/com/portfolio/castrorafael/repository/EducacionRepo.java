package com.portfolio.castrorafael.repository;

import com.portfolio.castrorafael.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EducacionRepo extends JpaRepository<Educacion, Integer> {

}
