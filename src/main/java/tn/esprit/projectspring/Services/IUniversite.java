package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Universite;

import java.util.List;

public interface IUniversite {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);
    List<Universite> findUniversite();
}
