package com.springdemo.gestionemploi.Service;

import com.springdemo.gestionemploi.Entity.Professeur;

import java.util.List;

public interface IProfesseurService {
    List<Professeur> getAllProfesseurs();
    Professeur getProfesseurById(Long id);
    Professeur saveProfesseur(Professeur professeur);
    Professeur updateProfesseur(Long id, Professeur professeur);
    void deleteProfesseur(Long id);

}
