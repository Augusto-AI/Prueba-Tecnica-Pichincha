// src/main/java/com/pichincha/accounts/service/TransactionService.java
package com.pichincha.accounts.service;

import com.pichincha.accounts.model.Transaction;

public interface TransactionService {
    void makeTransaction(Long accountId, Double amount);
    // Otros métodos relacionados con transacciones
}
