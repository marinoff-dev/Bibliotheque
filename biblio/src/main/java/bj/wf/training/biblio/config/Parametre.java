package bj.wf.training.biblio.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parametre {
    private int nombreMaxEmpruntEncours;
    private int dureeLimiteReservation;
}



