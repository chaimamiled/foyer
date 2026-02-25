package tn.esprit.projectspring.Controlleurs;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectspring.Repositories.chambreRepository;
import tn.esprit.projectspring.Services.ChambreService;
import tn.esprit.projectspring.Services.Ichambre;
import tn.esprit.projectspring.entity.Chambre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    Ichambre ichambre;

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return ichambre.addChambre(chambre);
    }
    @PutMapping("/update")
    public Chambre update(@RequestBody Chambre chambre) {
        return ichambre.updateChambre(chambre);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ichambre.deleteChambre(id);
    }

    @GetMapping("/all")
    public List<Chambre> getAll() {
        return ichambre.findAllChambre();
    }

}