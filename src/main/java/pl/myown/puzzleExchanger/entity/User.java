package pl.myown.puzzleexchanger.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude= "password")
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =30)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Embedded
    private Adress adress;


    private String created;
    private String updated;
    private boolean active = true;

    @Column (name="role")
    private String role = "ROLE_USER";

    @OneToMany (mappedBy = "user")
    List<Puzzles> puzzles = new ArrayList<>();







}
