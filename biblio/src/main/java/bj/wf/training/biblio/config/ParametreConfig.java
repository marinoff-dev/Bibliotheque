package bj.wf.training.biblio.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParametreConfig {

    @Value("${NB_EMPRUNT_MAX_ENCOURS}")
    private int nombreMaxEmpruntEncours;
    @Value("${DUREE_LIMITE_RESERVATION}")
    private int dureeLimiteReservation;

    @Bean
    public Parametre getParametre() {
        Parametre parametre = Parametre.builder().dureeLimiteReservation(dureeLimiteReservation)
                .nombreMaxEmpruntEncours(nombreMaxEmpruntEncours).build();
        return parametre;

    }


}
