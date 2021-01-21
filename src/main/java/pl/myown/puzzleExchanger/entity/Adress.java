package pl.myown.puzzleexchanger.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
public class Adress {

    private String city;
    private String zipCode;
    private String street;
}
