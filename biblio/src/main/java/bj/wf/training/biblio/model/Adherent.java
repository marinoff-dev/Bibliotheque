package bj.wf.training.biblio.model;

import java.util.Date;
import org.hibernate.validator.constraints.Length;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Adherent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    @Size(min = 8, max = 50)
    @NotBlank
    @NotNull
    @NotEmpty
    //@Min(value = 8)
    private String pseudo;

    private String nom;

    private String prenoms;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Embedded
    /* @AssociationOverrides({
            @AssociationOverride(name = "pays", joinColumns = @JoinColumn(name = "pays_residence_id")),
            @AssociationOverride(name = "departement", joinColumns = @JoinColumn(name = "departement_residence_id")),
            @AssociationOverride(name = "commune", joinColumns = @JoinColumn(name = "commune_residence_id")),
            @AssociationOverride(name = "arrondissement", joinColumns = @JoinColumn(name = "arrondissement_residence_id")),
            @AssociationOverride(name = "village", joinColumns = @JoinColumn(name = "village_residence_id"))
    })
    @AttributeOverrides({
            @AttributeOverride(name = "villeEtrangere", column = @Column(name = "ville_etrangere_residence")),
            @AttributeOverride(name = "complement", column = @Column(name = "complement_residence"))
    }) */
    private Adresse adresse;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;

    //@Size(max = 5)
    private int nombreEmpruntEnCours;

}
