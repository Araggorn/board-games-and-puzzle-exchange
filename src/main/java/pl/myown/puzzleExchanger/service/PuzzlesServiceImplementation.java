package pl.myown.puzzleexchanger.service;

import org.springframework.stereotype.Service;
import pl.myown.puzzleexchanger.entity.Puzzles;

import java.util.List;

@Service
public class PuzzlesServiceImplementation implements PuzzlesService {

    @Override
    public List<Puzzles> findAllPuzzles() {
        return null;
    }

    @Override
    public Long numberOfPuzzles() {
        return null;
    }
}
