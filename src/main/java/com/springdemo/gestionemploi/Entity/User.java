package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String login;
    private String motDePasse;

    @Enumerated(EnumType.STRING)
    private Role role;
    public enum Role {
        ADMIN , PROFESSEUR ,Etudiant

    }


}
