package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

    List<Etudiant> findByGroupeId(Long groupeId);
}
