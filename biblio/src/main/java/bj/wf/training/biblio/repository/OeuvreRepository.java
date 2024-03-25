package bj.wf.training.biblio.repository;

import bj.wf.training.biblio.model.Emprunt;
import bj.wf.training.biblio.model.Oeuvre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OeuvreRepository extends JpaRepository<Oeuvre, Long> {

}
