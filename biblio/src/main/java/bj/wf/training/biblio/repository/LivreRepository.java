package bj.wf.training.biblio.repository;

import bj.wf.training.biblio.model.Emprunt;
import bj.wf.training.biblio.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {

}
