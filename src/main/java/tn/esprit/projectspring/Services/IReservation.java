package tn.esprit.projectspring.Services;

import tn.esprit.projectspring.entity.Reservation;

import java.util.List;

public interface IReservation {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> findReservation();
}
