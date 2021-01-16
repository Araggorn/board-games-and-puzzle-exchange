package pl.myown.puzzleexchanger.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.myown.puzzleexchanger.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerUserDetailService implements UserDetailsService {

    private final UserRepository repository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.debug("Searching for user by username '{}", username);

        if (!repository.existsByUsername(username)) {
            throw new UsernameNotFoundException(String.format("Username %s not found", username));
        }

        final pl.myown.puzzleexchanger.entity.User userEntity = repository.getByUsername(username);
        UserDetails user = User.withUsername(userEntity.getUsername()).password(userEntity.getPassword()).authorities(userEntity.getRole()).build();
        return user;
    }
}


