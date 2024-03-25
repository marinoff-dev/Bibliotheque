package bj.wf.training.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bj.wf.training.biblio.model.Cheque;

@Repository
public interface ChequeRepository extends JpaRepository<Cheque, Long> {

}
