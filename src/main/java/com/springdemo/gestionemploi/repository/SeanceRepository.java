package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, Integer> {
    List<Seance> findByProfesseurId(Long professeurId);
    List<Seance> findByGoupeId(Long groupeId);
    List<Seance> findBySalleId(Long salleId);
    List<Seance> findByHeureDebutBetween(LocalDateTime start, LocalDateTime end);


    List<Seance> findBySalleIdAndJourAndHeureDebutBeforeAndHeureFinAfter(
            Long salleId, LocalDate jour, LocalTime heureFin, LocalTime heureDebut);

    List<Seance> findByProfesseurIdAndJourAndHeureDebutBeforeAndHeureFinAfter(
            Long professeurId, LocalDate jour, LocalTime heureFin, LocalTime heureDebut);

    List<Seance> findByGroupeIdAndJourAndHeureDebutBeforeAndHeureFinAfter(
            Long groupeId, LocalDate jour, LocalTime heureFin, LocalTime heureDebut);





}
