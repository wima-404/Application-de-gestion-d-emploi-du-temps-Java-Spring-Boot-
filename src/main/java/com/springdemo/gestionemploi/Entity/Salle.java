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
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String type;
    private String capacite;

    //@Column(unique=true, nullable=false)
    //private String nom;

    //@Column( nullable=false)
    //private String capacite;

    @OneToMany(mappedBy = "salle", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Seance> seances;
}
