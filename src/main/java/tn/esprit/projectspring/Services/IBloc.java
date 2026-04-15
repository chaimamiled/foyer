package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Bloc;

import java.util.List;

public interface IBloc {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long id);
    List<Bloc> findBloc();
// keyword
  List<Bloc> getBlocByNom(String nom);
  List<Bloc> getBlocContaining(String mot);
  List<Bloc> getBlocByCapaciteGreaterThan(Long capacite);
  List<Bloc> getBlocByCapaciteBetween(Long min, Long max);
  List<Bloc> getAllBlocOrderByNom();

    //jpql
    List<Bloc> findBlocByNomJPQL(String nom);
    List<Bloc> findBlocByCapJPQL(Long cap);
    List<Bloc> findByNomAndCapJPQL(String nom, Long cap);
    void updateCapacite(Long id, Long cap);
    void deleteByNomJPQL(String nom);
}

