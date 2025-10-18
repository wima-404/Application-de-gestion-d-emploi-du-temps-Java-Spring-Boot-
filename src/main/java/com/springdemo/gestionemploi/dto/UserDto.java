package com.springdemo.gestionemploi.dto;

import com.springdemo.gestionemploi.Entity.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class UserDto {
    private Long id;
    @NotBlank(message = "Le nom ne peut pas être vide")
    private String nom;
    @NotBlank(message = "Le prénom ne peut pas être vide")
    private String prenom;
    @NotBlank(message = "Le login ne peut pas être vide")
    private String login;

    private String motDePasse;
    @NotNull(message = "Le rôle ne peut pas être nul")
    private Role role;
}
