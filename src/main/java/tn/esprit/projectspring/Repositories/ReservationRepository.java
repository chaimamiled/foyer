package tn.esprit.projectspring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projectspring.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
