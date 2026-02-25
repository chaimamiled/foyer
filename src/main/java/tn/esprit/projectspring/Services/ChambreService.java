package tn.esprit.projectspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.EtudiantRepository;
import tn.esprit.projectspring.Repositories.chambreRepository;
import tn.esprit.projectspring.entity.Chambre;
import tn.esprit.projectspring.entity.Etudiant;

import java.util.List;

@Service
public class ChambreService implements Ichambre {
@Autowired
chambreRepository chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }


    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }


    @Override
    public void deleteChambre(Long idChambre) {
chambreRepository.deleteById(idChambre);
    }


    @Override
    public List<Chambre> findAllChambre() {
        return chambreRepository.findAll();
    }
}
