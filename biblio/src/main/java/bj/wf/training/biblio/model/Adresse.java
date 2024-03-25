package bj.wf.training.biblio.model;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;
    private String numeroTelephone;

}
