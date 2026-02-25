package tn.esprit.projectspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.EtudiantRepository;
import tn.esprit.projectspring.entity.Etudiant;

import java.util.List;
@Service
public class EtudiantService implements IEtudiant{

    @Autowired
    private EtudiantRepository etudiantRepository;
    /**
     * @param etudiant
     * @return
     */
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    /**
     * @param etudiant
     * @return
     */
    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    /**
     * @param id
     */
    @Override
    public void deleteEtudiant(Long id) {
etudiantRepository.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Etudiant> findEtudiant() {
        return etudiantRepository.findAll();
    }
}
