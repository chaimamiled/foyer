package tn.esprit.projectspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projectspring.entity.Chambre;

@Repository
public interface chambreRepository extends JpaRepository<Chambre,Long> {
}
