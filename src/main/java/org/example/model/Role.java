package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Role {
    private String name;

    private Set<User> users = new HashSet<>();
}
