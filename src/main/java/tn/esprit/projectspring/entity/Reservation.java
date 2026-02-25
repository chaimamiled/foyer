package tn.esprit.projectspring.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idReservation;
    Date anneeUniversitaire;
    boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants    ;

}
