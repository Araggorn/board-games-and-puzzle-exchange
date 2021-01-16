package pl.myown.puzzleexchanger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.myown.puzzleexchanger.entity.User;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    User getByUsername(String username);

    boolean existsByUsername(String username);
}
