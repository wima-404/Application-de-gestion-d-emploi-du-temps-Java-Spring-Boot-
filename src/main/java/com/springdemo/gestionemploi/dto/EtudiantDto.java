package com.springdemo.gestionemploi.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class EtudiantDto extends UserDto{
    @NotNull(message = "L'ID du groupe ne peut pas être nul")
    private Long groupeId;
    private String groupeNom;
}
