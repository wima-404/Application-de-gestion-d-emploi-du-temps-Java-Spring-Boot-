package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur , Long> {


}
