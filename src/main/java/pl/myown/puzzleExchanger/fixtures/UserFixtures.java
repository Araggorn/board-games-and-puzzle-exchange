package pl.myown.puzzleexchanger.fixtures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.myown.puzzleexchanger.converter.TimeConverter;
import pl.myown.puzzleexchanger.entity.User;
import pl.myown.puzzleexchanger.service.UserService;

import java.util.Arrays;
import java.util.List;

@Component
@Profile({"local", "postgres"})
public class UserFixtures {
    UserService userService;


    private final List<User> userList = Arrays.asList(
            new User(null, "Araggorn", "masło", "zerelik@o2.pl", TimeConverter.timeNowLong(), TimeConverter.timeNowLong(), true, "admin"),
            new User(null, "Asia", "olek", "askabu@interia.pl", TimeConverter.timeNowLong(), TimeConverter.timeNowLong(), true, "admin")
    );

    @Autowired
    public UserFixtures(UserService userService) {
        this.userService = userService;
    }


    public void loadIntoDB() {
    }
}
