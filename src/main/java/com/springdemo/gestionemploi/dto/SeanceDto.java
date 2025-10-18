package com.springdemo.gestionemploi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class SeanceDto {
    private Long id;

    @NotNull(message = "Le jour de la séance ne peut pas être nul")
    @FutureOrPresent(message = "Le jour de la séance doit être dans le futur ou aujourd'hui") // La séance ne peut pas être dans le passé
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate jour;

    @NotNull(message = "L'heure de début ne peut pas être nulle")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime heureDebut;

    @NotNull(message = "L'heure de fin ne peut pas être nulle")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime heureFin;

    @NotNull(message = "L'ID de la matière ne peut pas être nul")
    private Long matiereId;
    private String matiereNom;

    @NotNull(message = "L'ID du professeur ne peut pas être nul")
    private Long professeurId;
    private String professeurNom;

    @NotNull(message = "L'ID de la salle ne peut pas être nul")
    private Long salleId;
    private String salleNom;

    @NotNull(message = "L'ID du groupe ne peut pas être nul")
    private Long groupeId;
    private String groupeNom;
}
