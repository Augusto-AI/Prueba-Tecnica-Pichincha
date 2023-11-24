// src/main/java/com/pichincha/accounts/repository/TransactionRepository.java
package com.pichincha.accounts.repository;

import com.pichincha.accounts.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Métodos específicos del repositorio si es necesario
}
