package tn.esprit.projectspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.FoyerRepository;
import tn.esprit.projectspring.entity.Foyer;

import java.util.List;

@Service
public class FoyerService implements IFoyer {
    @Autowired
    FoyerRepository foyerRepository;
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
}
