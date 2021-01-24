package pl.myown.puzzleexchanger.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.myown.puzzleexchanger.entity.Puzzles;
import pl.myown.puzzleexchanger.service.PuzzlesService;

import java.util.Arrays;
import java.util.List;

@Component
@Profile({"local", "postgres"})
public class PuzzlesFixtures {
    
    PuzzlesService puzzlesService;

    private final List<Puzzles> teamList = Arrays.asList(
            new Puzzles(null, "White Dragon", 1000),
            new Puzzles(null, "Smurphs", 80),
            new Puzzles(null, "My family in the forest", 300)
    );

    @Autowired
    public PuzzlesFixtures(PuzzlesService puzzlesService) {
        this.puzzlesService = puzzlesService;
    }

    public void loadIntoDB() {
    }
}
