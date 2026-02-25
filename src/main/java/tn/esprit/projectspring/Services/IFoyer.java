package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Foyer;

import java.util.List;

public interface IFoyer {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(Long id);
    List<Foyer> findFoyer();
}
