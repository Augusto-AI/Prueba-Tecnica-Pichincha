// src/main/java/com/pichincha/accounts/repository/TransactionRepository.java
package pichincha.accounts.repository;

import pichincha.accounts.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Métodos específicos del repositorio si es necesario
}
