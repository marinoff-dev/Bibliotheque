package bj.wf.training.biblio.repository;

import bj.wf.training.biblio.model.Adherent;
import bj.wf.training.biblio.model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {

}
