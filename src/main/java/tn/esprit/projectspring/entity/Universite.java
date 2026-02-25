package tn.esprit.projectspring.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long idUniversite;
    String nomUniversite;
    Long adresse ;

 @OneToOne
 private Foyer foyer;

}
