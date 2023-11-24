// src/main/java/com/pichincha/accounts/repository/AccountRepository.java
package com.pichincha.accounts.repository;

import com.pichincha.accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // Métodos específicos del repositorio si es necesario
}
