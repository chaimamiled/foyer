package tn.esprit.projectspring.Services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.BlocRepository;
import tn.esprit.projectspring.Repositories.chambreRepository;
import tn.esprit.projectspring.entity.Bloc;
import tn.esprit.projectspring.entity.Chambre;

import java.util.List;
@Transactional
@AllArgsConstructor
@Service
public class BlocService implements IBloc {
    @Autowired
    BlocRepository blocRepository;
    chambreRepository chambreRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long id) {
blocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> findBloc() {
        return blocRepository.findAll();
    }

    public List<Bloc> getBlocByNom(String nom) {
        return blocRepository.findByNomBloc(nom);
    }

    public List<Bloc> getBlocContaining(String mot) {
        return blocRepository.findByNomBlocContaining(mot);
    }
    @Override
    public List<Bloc> getBlocByCapaciteGreaterThan(Long capacite) {
        return blocRepository.findByCapaciteBlocGreaterThan(capacite);
    }

    @Override
    public List<Bloc> getBlocByCapaciteBetween(Long min, Long max) {
        return blocRepository.findByCapaciteBlocBetween(min, max);
    }


    @Override
    public List<Bloc> getAllBlocOrderByNom() {
        return blocRepository.findAllByOrderByNomBlocAsc();
    }

    //jpql

    @Override
    public List<Bloc> findBlocByNomJPQL(String nom) {
        return blocRepository.findBlocByNomJPQL(nom);
    }

    @Override
    public List<Bloc> findBlocByCapJPQL(Long cap) {
        return blocRepository.findBlocByCapJPQL(cap);
    }

    @Override
    public List<Bloc> findByNomAndCapJPQL(String nom, Long cap) {
        return blocRepository.findByNomAndCapJPQL(nom, cap);
    }
    //update and delete
    @Override
    public void updateCapacite(Long id, Long cap) {
        blocRepository.updateCapacite(cap, id);
    }

    @Override
    public void deleteByNomJPQL(String nom) {
        blocRepository.deleteByNomJPQL(nom);
    }



    //affectation bloc : parent
    //ajouter bloc avec chambre


}
