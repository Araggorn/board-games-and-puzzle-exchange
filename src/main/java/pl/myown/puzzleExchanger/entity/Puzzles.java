package pl.myown.puzzleexchanger.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Table(name="puzzles")
public class Puzzles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer numberOfPuzzles;

    @ManyToOne
    private User user;

    public Puzzles(Long id, String name, Integer numberOfPuzzles) {
        this.id = id;
        this.name = name;
        this.numberOfPuzzles = numberOfPuzzles;
    }
}

