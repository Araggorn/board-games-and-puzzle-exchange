package pl.myown.puzzleexchanger.converter;

import pl.myown.puzzleexchanger.dto.UserDto;
import pl.myown.puzzleexchanger.entity.Adress;
import pl.myown.puzzleexchanger.entity.User;

public class UserConverter {

    public static UserDto toDto (User user, Adress adress) {
    return UserDto.builder()
            .id(user.getId())
            .username(user.getUsername())
            .email(user.getEmail())
            .password(user.getPassword())
            .city(adress.getCity())
            .zipCode(adress.getZipCode())
            .street(adress.getStreet())
            .build();
    }
}
