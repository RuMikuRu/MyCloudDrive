package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class File {
    private String name;

    private Long size;

    private String mimType;

    private String location;

    private Folder parent;

    private User owner;

    private Set<Property> properties = new HashSet<>();
}
