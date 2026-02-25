package tn.esprit.projectspring.Controlleurs;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectspring.Services.IReservation;
import tn.esprit.projectspring.entity.Foyer;
import tn.esprit.projectspring.entity.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservation ireservation;

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return ireservation.addReservation(reservation);
    }
    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return ireservation.updateReservation(reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ireservation.deleteReservation(id);
    }

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return ireservation.findReservation();
    }
}
