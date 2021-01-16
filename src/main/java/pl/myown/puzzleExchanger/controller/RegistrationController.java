package pl.myown.puzzleexchanger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.myown.puzzleexchanger.dto.UserDto;
import pl.myown.puzzleexchanger.service.UserService;

@Controller
public class RegistrationController {
    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String form(Model model) {
        model.addAttribute("user", new UserDto());
        return "registration";
    }
}
