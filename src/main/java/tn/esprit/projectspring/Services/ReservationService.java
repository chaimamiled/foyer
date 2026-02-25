package tn.esprit.projectspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.ReservationRepository;
import tn.esprit.projectspring.entity.Reservation;

import java.util.List;

@Service
public class ReservationService implements IReservation {
    @Autowired
    ReservationRepository reservationRepository;
    /**
     * @param reservation
     * @return
     */
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    /**
     * @param reservation
     * @return
     */
    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    /**
     * @param id
     */
    @Override
    public void deleteReservation(Long id) {
reservationRepository.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Reservation> findReservation() {
        return reservationRepository.findAll();
    }
}
