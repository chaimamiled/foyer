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

}
