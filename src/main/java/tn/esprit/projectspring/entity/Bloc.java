package tn.esprit.projectspring.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idBloc ;
    String nomBloc ;
    Long capaciteBloc;

  @ManyToOne(cascade = CascadeType.ALL, optional = true)
  Foyer foyer;
  @OneToMany(mappedBy = "bloc")
    private Set<Chambre> chambres;
}
