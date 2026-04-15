package tn.esprit.projectspring.Controlleurs;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectspring.Services.IBloc;
import tn.esprit.projectspring.entity.Bloc;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBloc ibloc;
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return ibloc.addBloc(bloc);
    }
    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return ibloc.updateBloc(bloc);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ibloc.deleteBloc(id);
    }

    @GetMapping("/all")
    public List<Bloc> getAll() {
        return ibloc.findBloc();
    }


    @GetMapping("/nom/{nom}")
    public List<Bloc> getBlocByNom(@PathVariable String nom) {
        return ibloc.getBlocByNom(nom);
    }

    @GetMapping("/search/{mot}")
    public List<Bloc> getBlocContaining(@PathVariable String mot) {
        return ibloc.getBlocContaining(mot);
    }
    @GetMapping("/capacite/greater/{val}")
    public List<Bloc> getBlocByCapaciteGreater(@PathVariable Long val) {
        return ibloc.getBlocByCapaciteGreaterThan(val);
    }

    @GetMapping("/capacite/between/{min}/{max}")
    public List<Bloc> getBlocByCapaciteBetween(@PathVariable Long min, @PathVariable Long max) {
        return ibloc.getBlocByCapaciteBetween(min, max);
    }

    @GetMapping("/orderbynom")
    public List<Bloc> getAllBlocOrderByNom() {
        return ibloc.getAllBlocOrderByNom();
    }

    // JPQL
    @GetMapping("/jpql/nom/{nom}")
    public List<Bloc> getByNomJPQL(@PathVariable String nom) {
        return ibloc.findBlocByNomJPQL(nom);
    }

    @GetMapping("/jpql/cap/{cap}")
    public List<Bloc> getByCapJPQL(@PathVariable Long cap) {
        return ibloc.findBlocByCapJPQL(cap);
    }

    @GetMapping("/jpql/nomcap/{nom}/{cap}")
    public List<Bloc> getByNomCapJPQL(@PathVariable String nom, @PathVariable Long cap) {
        return ibloc.findByNomAndCapJPQL(nom, cap);
    }

    @PutMapping("/jpql/update/{id}/{cap}")
    public void updateCap(@PathVariable Long id, @PathVariable Long cap) {
        ibloc.updateCapacite(id, cap);
    }
    @DeleteMapping("/jpql/delete/{nom}")
    public void deleteByNom(@PathVariable String nom) {
        ibloc.deleteByNomJPQL(nom);
    }
}
