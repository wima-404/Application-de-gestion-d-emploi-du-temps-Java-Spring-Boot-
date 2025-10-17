package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "professeurs")
@PrimaryKeyJoinColumn(name = "professeur_id")
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=true)


public class Professeur extends User{


}
