package bj.wf.training.biblio.service;

import bj.wf.training.biblio.model.Adherent;
import bj.wf.training.biblio.model.Cheque;

import java.util.List;
import java.util.Optional;

public interface ChequeService {
    Cheque create(Cheque cheque);
    Optional<Cheque> update(Cheque cheque);
    List<Cheque> findAll();
    Optional<Cheque> findOne(Long id);
    void delete(Long id);
    Optional<Cheque> encaisser(String referenceCheque);
}
