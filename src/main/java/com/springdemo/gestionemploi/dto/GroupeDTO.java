package com.springdemo.gestionemploi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class GroupeDTO {
    private Long id;
    @NotBlank(message = "Le nom du groupe ne peut pas être vide")
    private String nom;
}
