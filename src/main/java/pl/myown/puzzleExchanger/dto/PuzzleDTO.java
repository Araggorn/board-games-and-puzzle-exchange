package pl.myown.puzzleexchanger.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PuzzleDTO {
    private Long id;
    private String name;
    private Integer numberOfPuzzles;
}
