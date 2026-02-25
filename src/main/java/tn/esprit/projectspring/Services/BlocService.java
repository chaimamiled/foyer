package tn.esprit.projectspring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projectspring.Repositories.BlocRepository;
import tn.esprit.projectspring.entity.Bloc;

import java.util.List;

@Service
public class BlocService implements IBloc {
    @Autowired
    BlocRepository blocRepository;
    /**
     * @param bloc
     * @return
     */
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    /**
     * @param bloc
     * @return
     */
    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    /**
     * @param id
     */
    @Override
    public void deleteBloc(Long id) {
blocRepository.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Bloc> findBloc() {
        return blocRepository.findAll();
    }
}
