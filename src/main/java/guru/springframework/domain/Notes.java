package guru.springframework.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // May be two unidirectional mappings as opposed to a bidirectional one
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
