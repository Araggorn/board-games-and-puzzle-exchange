package pl.myown.puzzleexchanger.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {

    private String city;
    private String zipCode;
    private String street;
}
