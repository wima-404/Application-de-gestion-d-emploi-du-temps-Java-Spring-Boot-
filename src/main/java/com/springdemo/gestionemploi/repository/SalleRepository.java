package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalleRepository extends JpaRepository<Salle, Integer> {
    Optional<Salle> findByNom(String nom);
    Boolean existsByNom(String nom);
}
