package tn.esprit.projectspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.UniversiteRepository;
import tn.esprit.projectspring.entity.Universite;

import java.util.List;

@Service
public class UniversiteService implements  IUniversite{
    @Autowired
    UniversiteRepository universiteRepository;
    /**
     * @param universite
     * @return
     */
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
}
