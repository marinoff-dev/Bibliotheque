package bj.wf.training.biblio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "adherent_id", "livre_id" }) })
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateRetourTheorique;

    @Temporal(TemporalType.DATE)
    private Date dateRetourEffective;

    private int nombreRappel;

    @ManyToOne
    private Adherent adherent;

    @ManyToOne
    private Livre livre;
}

