package pl.myown.puzzleexchanger.converter;

import pl.myown.puzzleexchanger.dto.PuzzleDTO;
import pl.myown.puzzleexchanger.entity.Puzzles;

public class PuzzlesConverter {

    public static PuzzleDTO toDto(Puzzles puzzles){
        return PuzzleDTO.builder()
                .id(puzzles.getId())
                .name(puzzles.getName())
                .numberOfPuzzles(puzzles.getNumberOfPuzzles())
                .build();
    }
}
