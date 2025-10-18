package com.springdemo.gestionemploi.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("ADMIN")
@Table(name = "admins_view")
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper=true)

public class Admin extends  User{

}
