package tn.esprit.projectspring.Controlleurs;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectspring.Services.IUniversite;
import tn.esprit.projectspring.entity.Foyer;
import tn.esprit.projectspring.entity.Universite;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversite iUniversite;
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return iUniversite.addUniversite(universite);
    }
    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return iUniversite.updateUniversite(universite);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        iUniversite.deleteUniversite(id);
    }

    @GetMapping("/all")
    public List<Universite> getAll() {
        return iUniversite.findUniversite();
    }
}
