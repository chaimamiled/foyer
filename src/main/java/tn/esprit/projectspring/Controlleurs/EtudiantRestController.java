package tn.esprit.projectspring.Controlleurs;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
    @Operation(description = "Ajouter un nouveau etudiant")
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiant.addEtudiant(etudiant);
    }
    @Operation(description = "modifier info d'un etudiant")
    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiant.updateEtudiant(etudiant);
    }

    @Operation(description = "supprimer etudiant")
    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        iEtudiant.deleteEtudiant(id);
    }

    @Operation(description = "Récupérer tous les etudiants")
    @GetMapping("/all")
    public List<Etudiant> getAll() {
        return iEtudiant.findEtudiant();
    }
}
