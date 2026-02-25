package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Bloc;

import java.util.List;

public interface IBloc {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long id);
List<Bloc> findBloc();}
