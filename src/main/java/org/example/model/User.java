package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private int id;

    private int version;

    private String email;
    private String password;
    private String firstName;
    private String lastName;

}
