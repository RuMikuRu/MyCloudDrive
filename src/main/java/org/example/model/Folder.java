package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Folder {
    private String name;

    private Boolean root;

    private Folder parent;

    private Set<Folder> subFolders = new HashSet<>();

    private Set<File> files = new HashSet<>();

    private User owner;
}
