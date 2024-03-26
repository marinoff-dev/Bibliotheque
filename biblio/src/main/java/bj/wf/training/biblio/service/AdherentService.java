package bj.wf.training.biblio.service;

import bj.wf.training.biblio.model.Adherent;

import java.util.List;
import java.util.Optional;

public interface AdherentService {
    Adherent create(Adherent adherent);
    Optional<Adherent> update(Adherent adherent);
    List<Adherent> findAll();
    Optional<Adherent> findOne(Long id);
    void delete(Long id);
}
