package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Integer> {

    Optional<Matiere> findByNom(String nom);
    //Boolean existsByNom(String nom);
}
