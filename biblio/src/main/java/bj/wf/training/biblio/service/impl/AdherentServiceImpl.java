package bj.wf.training.biblio.service.impl;

import bj.wf.training.biblio.model.Adherent;
import bj.wf.training.biblio.repository.AdherentRepository;
import bj.wf.training.biblio.service.AdherentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdherentServiceImpl implements AdherentService {
    private AdherentRepository adherentRepository;

    public AdherentServiceImpl(AdherentRepository adherentRepository) {
        this.adherentRepository = adherentRepository;
    }

    @Override
    public Adherent create(Adherent adherent) {
        return adherentRepository.save(adherent);
    }

    @Override
    public Optional<Adherent> update(Adherent adherent) {
        Optional<Adherent> adherentInDb = findOne(adherent.getId());
        if(adherentInDb.isPresent()) return Optional.of(adherentRepository.save(adherent));
        return Optional.empty();
    }

    @Override
    public List<Adherent> findAll() {
        return adherentRepository.findAll();
    }

    @Override
    public Optional<Adherent> findOne(Long id) {
        return adherentRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        adherentRepository.deleteById(id);
    }
}
