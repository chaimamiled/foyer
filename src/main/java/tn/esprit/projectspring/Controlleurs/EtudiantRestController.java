package tn.esprit.projectspring.Controlleurs;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectspring.Services.IEtudiant;
import tn.esprit.projectspring.Services.Ichambre;
import tn.esprit.projectspring.entity.Chambre;
import tn.esprit.projectspring.entity.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiant iEtudiant;

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiant.addEtudiant(etudiant);
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiant.updateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        iEtudiant.deleteEtudiant(id);
    }

    @GetMapping("/all")
    public List<Etudiant> getAll() {
        return iEtudiant.findEtudiant();
    }
}
