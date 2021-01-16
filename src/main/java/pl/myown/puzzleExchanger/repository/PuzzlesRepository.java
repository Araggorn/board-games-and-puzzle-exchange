package pl.myown.puzzleexchanger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.myown.puzzleexchanger.entity.Puzzles;

@Repository
public interface PuzzlesRepository extends JpaRepository <Puzzles, Long> {
}
