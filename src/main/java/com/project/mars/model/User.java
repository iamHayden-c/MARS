package com.project.mars.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;
import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name="user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, updatable = false, columnDefinition = "uuid")
    private UUID id;

    @Column(name="username", nullable = false)
    private String name;

    @Column(name="password", nullable = false)
    private String password;
}
