package pl.myown.puzzleexchanger.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile({"local", "postgres"})
public class LoadFixtures {

    private final UserFixtures userFixture;
    private final PuzzlesFixtures puzzlesFixtures;

    @Autowired
    public LoadFixtures(UserFixtures userFixture, PuzzlesFixtures puzzlesFixtures) {
        this.userFixture = userFixture;
        this.puzzlesFixtures = puzzlesFixtures;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {

       puzzlesFixtures.loadIntoDB();
        userFixture.loadIntoDB();

    }
}
