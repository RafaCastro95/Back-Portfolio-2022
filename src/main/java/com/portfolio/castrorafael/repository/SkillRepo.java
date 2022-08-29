package com.portfolio.castrorafael.repository;

import com.portfolio.castrorafael.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillRepo extends JpaRepository<Skill, Integer> {

    public Optional<Skill> findByNombreSkill(String nombreSkill);

    public boolean existsByNombreSkill (String nombreSkill);
}
