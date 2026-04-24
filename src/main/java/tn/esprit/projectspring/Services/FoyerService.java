package tn.esprit.projectspring.Services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.FoyerRepository;
import tn.esprit.projectspring.Repositories.UniversiteRepository;
import tn.esprit.projectspring.entity.Foyer;
import tn.esprit.projectspring.entity.Universite;

import java.util.List;

@Service
public class FoyerService implements IFoyer {
    @Autowired
    FoyerRepository foyerRepository;
UniversiteRepository universiteRepository;
/**
     * @param foyer
     * @return
     */
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    /**
     * @param foyer
     * @return
     */
    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    /**
     * @param id
     */
    @Override
    public void deleteFoyer(Long id) {
foyerRepository.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Foyer> findFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    @Transactional
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {

        Universite universite = universiteRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException("Université introuvable"));

        Foyer savedFoyer = foyerRepository.save(foyer);
        savedFoyer.setUniversite(universite);
        universite.setFoyer(savedFoyer);

        universiteRepository.save(universite);

        return savedFoyer;
    }

}
