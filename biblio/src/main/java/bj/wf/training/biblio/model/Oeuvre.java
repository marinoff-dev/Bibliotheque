package bj.wf.training.biblio.model;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Oeuvre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    @Length(max = 100)
    @NotBlank
    @NotNull
    @NotEmpty
    private String isbn;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    @NotEmpty
    private String titre;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    @NotEmpty
    private String auteur;

    private int nombreLivreLibre;
}
