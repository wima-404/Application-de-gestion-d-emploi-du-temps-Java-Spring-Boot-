package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name = "etudiants")
@PrimaryKeyJoinColumn(name = "etudiants")
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)

public class Etudiant extends User{

    @ManyToOne(fetch =  FetchType.LAZY)

    @JoinColumn(name = "groupe_id", nullable = false)

    private Groupe groupe;


}
