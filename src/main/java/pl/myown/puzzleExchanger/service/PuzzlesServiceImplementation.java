package pl.myown.puzzleexchanger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.myown.puzzleexchanger.entity.Puzzles;
import pl.myown.puzzleexchanger.repository.PuzzlesRepository;

import java.util.List;

@Service
public class PuzzlesServiceImplementation implements PuzzlesService {

    PuzzlesRepository repository;

    @Autowired
    public PuzzlesServiceImplementation(PuzzlesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Puzzles> findAllPuzzles() {
        return null;
    }

    @Override
    public Long numberOfPuzzles() {
        return null;
    }

    @Override
    public void add(Puzzles puzzles) {
        repository.save(puzzles);

    }
}
