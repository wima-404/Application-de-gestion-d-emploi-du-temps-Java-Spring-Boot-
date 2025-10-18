package com.springdemo.gestionemploi.Service;

import com.springdemo.gestionemploi.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(Long id);
    Etudiant saveEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Long id, Etudiant etudiant);
    void deleteEtudiant(Long id);
    List<Etudiant> getEtudiantsByGroupe(Long groupeId);
}
