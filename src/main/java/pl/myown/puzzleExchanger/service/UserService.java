package pl.myown.puzzleexchanger.service;

import pl.myown.puzzleexchanger.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    Long numberOfUsers();


}
