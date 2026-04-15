package tn.esprit.projectspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.projectspring.entity.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {
    // keywords
    List<Bloc> findByNomBloc(String nomBloc);
    List<Bloc> findByNomBlocContaining(String mot);
    List<Bloc> findByCapaciteBlocGreaterThan(Long capacite);
    List<Bloc> findByCapaciteBlocBetween(Long min, Long max);
    List<Bloc> findAllByOrderByNomBlocAsc();

    //jpql
    @Query("SELECT b FROM Bloc b WHERE b.nomBloc = :nom")
    List<Bloc> findBlocByNomJPQL(@Param("nom") String nom);

    @Query("SELECT b FROM Bloc b WHERE b.capaciteBloc > :cap")
    List<Bloc> findBlocByCapJPQL(@Param("cap") Long cap);

    @Query("SELECT b FROM Bloc b WHERE b.nomBloc = :nom AND b.capaciteBloc > :cap")
    List<Bloc> findByNomAndCapJPQL(@Param("nom") String nom, @Param("cap") Long cap);

    @Modifying
    @Query("UPDATE Bloc b SET b.capaciteBloc = :cap WHERE b.idBloc = :id")
    void updateCapacite(@Param("cap") Long cap, @Param("id") Long id);

    @Modifying
    @Query("DELETE FROM Bloc b WHERE b.nomBloc = :nom")
    void deleteByNomJPQL(@Param("nom") String nom);

}
