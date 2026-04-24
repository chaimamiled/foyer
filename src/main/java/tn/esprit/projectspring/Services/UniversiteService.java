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
public class UniversiteService implements  IUniversite{
    @Autowired
    UniversiteRepository universiteRepository;
    @Autowired
    FoyerRepository foyerRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    /**
     * @param universite
     * @return
     */
    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long id) {
universiteRepository.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Universite> findUniversite() {
        return universiteRepository.findAll();
    }

    /**
     * @param idFoyer
     * @param nomUniversite
     * @return
     */

    //affectation
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {

        Foyer foyer = foyerRepository.findById(idFoyer)
                .orElseThrow(() -> new RuntimeException("Foyer introuvable"));

        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);

        if (universite == null) {
            throw new RuntimeException("Université introuvable");
        }

        universite.setFoyer(foyer);
        foyer.setUniversite(universite);

        return universiteRepository.save(universite);
    }

    @Override
    @Transactional
    public Universite desaffecterFoyerAUniversite(long idUniversite) {

        Universite universite = universiteRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException("Université introuvable"));

        Foyer foyer = universite.getFoyer();

        if (foyer != null) {
            universite.setFoyer(null);
            foyer.setUniversite(null);
        }

        return universiteRepository.save(universite);
    }
}
