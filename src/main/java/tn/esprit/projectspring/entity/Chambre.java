package tn.esprit.projectspring.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idChambre ;
    Long numeroChambre ;

  @Enumerated(EnumType.STRING)
  private TypeChambre typeC ;

  @ManyToOne(cascade = CascadeType.ALL)
    private Bloc bloc;

  @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
