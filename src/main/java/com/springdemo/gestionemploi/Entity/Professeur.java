package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "professeurs")
@PrimaryKeyJoinColumn(name = "professeur_id")
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=true)


public class Professeur extends User{
    @OneToMany(mappedBy = "professeur", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Seance> seances;

}
