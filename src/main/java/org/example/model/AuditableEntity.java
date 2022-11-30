package org.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
public class AuditableEntity extends BaseEntity {
    private Long version;

    private Instant dateCreated;

    private Instant dateModify;


}
