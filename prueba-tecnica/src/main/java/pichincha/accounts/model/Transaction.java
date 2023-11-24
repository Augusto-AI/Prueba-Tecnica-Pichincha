// src/main/java/com/pichincha/accounts/model/Transaction.java
package com.pichincha.accounts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    private Long transactionId;
    private Long accountId;
    private Double amount;

    // Getters and setters
}
