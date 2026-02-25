package tn.esprit.projectspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projectspring.entity.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
