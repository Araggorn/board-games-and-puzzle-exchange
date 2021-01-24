package pl.myown.puzzleexchanger.service;


import pl.myown.puzzleexchanger.entity.Puzzles;

import java.util.List;

public interface PuzzlesService {

    List<Puzzles> findAllPuzzles();

    Long numberOfPuzzles();

    void add(Puzzles puzzles);
}
