package bj.wf.training.biblio.repository;

import bj.wf.training.biblio.model.Oeuvre;
import bj.wf.training.biblio.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
