// src/main/java/com/pichincha/accounts/service/AccountService.java
package com.pichincha.accounts.service;

import com.pichincha.accounts.model.Account;

public interface AccountService {
    Account getAccountById(Long accountId);
    Double getAccountBalance(Long accountId);
    // Otros métodos relacionados con cuentas
}
