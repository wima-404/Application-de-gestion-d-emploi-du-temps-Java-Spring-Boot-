package com.springdemo.gestionemploi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class SalleDto {
    private Long id;
    @NotBlank(message = "Le nom de la salle ne peut pas être vide")
    private String nom;
    @NotNull(message = "La capacité ne peut pas être nulle")
    @Min(value = 1, message = "La capacité doit être au moins de 1") // Capacité minimale de 1
    private Integer capacite;
}
