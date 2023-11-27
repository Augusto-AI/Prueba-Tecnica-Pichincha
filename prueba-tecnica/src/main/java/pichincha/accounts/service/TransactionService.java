// src/main/java/com/pichincha/accounts/service/TransactionService.java
package pichincha.accounts.service;



public interface TransactionService {
    void makeTransaction(Long accountId, Double amount);
    // Otros métodos relacionados con transacciones
}
