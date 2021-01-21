package pl.myown.puzzleexchanger.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String email;

    private String city;
    private String zipCode;
    private String street;

}
