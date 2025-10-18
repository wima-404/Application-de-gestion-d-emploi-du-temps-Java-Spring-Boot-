package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable=false)
    private String nom;


    // @OneToMany(mappedBy = "matiere", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // private List<Seance> seances;
}
