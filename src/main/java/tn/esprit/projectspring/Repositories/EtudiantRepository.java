package tn.esprit.projectspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projectspring.entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
