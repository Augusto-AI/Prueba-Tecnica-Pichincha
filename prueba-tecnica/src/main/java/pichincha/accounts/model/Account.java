// src/main/java/com/pichincha/accounts/model/Account.java
package com.pichincha.accounts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private Long accountId;
    private String accountHolderName;
    private Double balance;

    // Getters and setters
}
