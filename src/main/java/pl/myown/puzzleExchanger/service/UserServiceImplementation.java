package pl.myown.puzzleexchanger.service;

import org.springframework.stereotype.Service;
import pl.myown.puzzleexchanger.entity.User;
import pl.myown.puzzleexchanger.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

    UserRepository repository;

    public UserServiceImplementation(UserRepository repository) {
        this.repository = repository;
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
}
