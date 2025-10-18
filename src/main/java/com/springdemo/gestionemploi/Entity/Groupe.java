package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true, nullable=false)
    private String nom;

    @OneToMany(mappedBy = "groupe", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Etudiant> etudiants;


    // @OneToMany(mappedBy = "groupe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    // private List<Seance> seances;

}
