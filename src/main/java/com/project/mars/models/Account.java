package com.project.mars.models

import java.persistance.*;
import java.util.UUID;

@Entity
@Table(name = 'account')

public class Account {


          // generated unique Identifier for account, relationship with User model//
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "accountId", nullable - false, columnDefinition - "uuid", updatable = false)
        private UUID accountId;

        @Column(name= "amount")
        private float amount;
        
        @Column(name = "profitLoss")
        private float profitLoss;

        @ManyToMany
        @JoinClumn(name = "user_id")
        private User user;
}