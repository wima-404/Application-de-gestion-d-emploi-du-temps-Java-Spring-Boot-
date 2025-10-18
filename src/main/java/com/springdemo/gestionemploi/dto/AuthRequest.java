package com.springdemo.gestionemploi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class AuthRequest {
    @NotBlank(message = "le login ne peut pas être vide")
    private String login;

    @NotBlank(message = "le mot de passe ne peut pas être vide")
    private String motDePasse;
}
