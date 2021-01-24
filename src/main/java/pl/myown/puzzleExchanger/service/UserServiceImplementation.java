package pl.myown.puzzleexchanger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.myown.puzzleexchanger.dto.UserDto;
import pl.myown.puzzleexchanger.entity.User;
import pl.myown.puzzleexchanger.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

    UserRepository repository;
    PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImplementation(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    // -------------------------------------

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public Long numberOfUsers() {
        return repository.count();
    }

    @Override
    public void add(UserDto user) {

    }

}
