package com.portfolio.castrorafael.repository;

import com.portfolio.castrorafael.model.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrabajoRepo extends JpaRepository<Trabajo, Integer> {
}
