package tn.esprit.projectspring.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idEtudiant ;
    String nomEtudiant ;
    String prenomEt ;
    Long cin ;
    String ecole ;
    Date dateNaissance ;

    @ManyToMany(mappedBy ="etudiants",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
