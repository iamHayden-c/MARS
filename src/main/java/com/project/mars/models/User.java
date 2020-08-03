package com.project.mars.models

import java.persistance.*;
import java.util.UUID;

@Entity
@Table(name = 'user')

public class User{
    
              // generated unique Identifier for account//
        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        @Column(name = "userId", nullable - false, columnDefinition - "uuid", updatable = false)
        private UUID userID;

        @Column(name = 'fName')
        private String fName;

        @Column(name = "lName")
        private String lName;

        @Column(name = "age")
        private int age;

        // relationship to pull in Account Unique ID//
        @ManyToMany(targetEntity = User.class, mappedBy = "AccountId", cascade = CascadeType.ALL)
        int account_Id;

}