package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Etudiant;

import java.util.List;

public interface IEtudiant {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long id);
    List<Etudiant> findEtudiant();
}
