package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Chambre;

import java.util.List;

public interface Ichambre {
    Chambre addChambre (Chambre chambre);
    Chambre updateChambre (Chambre chambre);
    void deleteChambre (Long idChambre);
    List<Chambre> findAllChambre();




}
