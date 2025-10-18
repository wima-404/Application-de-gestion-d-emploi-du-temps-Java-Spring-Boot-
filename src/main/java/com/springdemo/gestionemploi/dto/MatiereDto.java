package com.springdemo.gestionemploi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MatiereDto {
    private Long id;
    @NotBlank(message = "Le nom de la matière ne peut pas être vide")
    private String nom;
}
