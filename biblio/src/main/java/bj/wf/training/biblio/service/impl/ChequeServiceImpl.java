package bj.wf.training.biblio.service.impl;

import bj.wf.training.biblio.model.Adherent;
import bj.wf.training.biblio.model.Cheque;
import bj.wf.training.biblio.repository.AdherentRepository;
import bj.wf.training.biblio.repository.ChequeRepository;
import bj.wf.training.biblio.service.AdherentService;
import bj.wf.training.biblio.service.ChequeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChequeServiceImpl implements ChequeService {
    private ChequeRepository chequeRepository;

    public ChequeServiceImpl(ChequeRepository chequeRepository) {
        this.chequeRepository = chequeRepository;
    }

    @Override
    public Cheque create(Cheque cheque) {
        return chequeRepository.save(cheque);
    }

    @Override
    public Optional<Cheque> update(Cheque cheque) {
        Optional<Cheque> chequeInDb = findOne(cheque.getId());
        if(chequeInDb.isPresent()) return Optional.of(chequeRepository.save(cheque));
        return Optional.empty();
    }

    @Override
    public List<Cheque> findAll() {
        return chequeRepository.findAll();
    }

    @Override
    public Optional<Cheque> findOne(Long id) {
        return chequeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        chequeRepository.deleteById(id);
    }

    @Override
    public Optional<Cheque> encaisser(String referenceCheque) {
        Optional<Cheque> chequeIndb = chequeRepository.findByReferenceCheque(referenceCheque);
        if(chequeIndb.isEmpty()) return Optional.empty();
        chequeIndb.get().setEstEncaisse(true);
        return Optional.of(chequeRepository.save(chequeIndb.get()));
    }

}
