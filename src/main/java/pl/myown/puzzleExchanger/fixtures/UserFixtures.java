package pl.myown.puzzleexchanger.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.myown.puzzleexchanger.service.UserService;

@Component
@Profile({"local", "postgres"})
public class UserFixtures {
    UserService userService;

    @Autowired
    public UserFixtures(UserService userService) {
        this.userService = userService;
    }




    public void loadIntoDB() {
    }
}
