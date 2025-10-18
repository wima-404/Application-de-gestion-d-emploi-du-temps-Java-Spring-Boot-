package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupeRepository extends JpaRepository<Groupe, Long> {

    Optional<Groupe> findByNom(String nom);
    //Boolean existsByNom(String nom);
}
