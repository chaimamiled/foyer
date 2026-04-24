package tn.esprit.projectspring.Controlleurs;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectspring.Services.FoyerService;
import tn.esprit.projectspring.Services.IFoyer;
import tn.esprit.projectspring.entity.Bloc;
import tn.esprit.projectspring.entity.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    IFoyer iFoyer;
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return iFoyer.addFoyer(foyer);
    }
    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return iFoyer.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        iFoyer.deleteFoyer(id);
    }

    @GetMapping("/all")
    public List<Foyer> getAll() {
        return iFoyer.findFoyer();
    }

    @PostMapping("/add/{idUniversite}")
    public Foyer addFoyerAndAssign(@RequestBody Foyer foyer,
                                   @PathVariable long idUniversite) {
        return iFoyer.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }
}
