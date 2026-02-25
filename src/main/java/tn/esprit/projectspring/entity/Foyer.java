package tn.esprit.projectspring.entity;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idFoyer;
    String nomFoyer;
    Long capaciteFoyer;

@OneToOne(mappedBy = "foyer")
    private Universite universite;
@OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL)
    private Set<Bloc> blocs;
}
