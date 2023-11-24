// src/main/java/com/pichincha/accounts/service/AccountService.java
package pichincha.accounts.service;

import pichincha.accounts.model.Account;

public interface AccountService {
    Account getAccountById(Long accountId);
    Double getAccountBalance(Long accountId);
    // Otros métodos relacionados con cuentas
}
