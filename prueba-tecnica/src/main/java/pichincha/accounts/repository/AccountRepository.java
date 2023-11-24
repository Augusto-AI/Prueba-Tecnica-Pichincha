package pichincha.accounts.repository;

import pichincha.accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // Puedes agregar métodos específicos del repositorio si es necesario
    Account findByNumber(String number);
    Account findByCustomerId(Long customerId);
    Account findByCustomerIdAndId(Long customerId, Long accountId);
    Account findByCustomerIdAndNumber(Long customerId, String number);
    Account findByCustomerIdAndType(Long customerId, String type);
    Account findByCustomerIdAndStatus(Long customerId, String status);
    Account findByCustomerIdAndBalance(Long customerId, Double balance);
    Account findByCustomerIdAndCurrency(Long customerId, String currency);
    Account findByCustomerIdAndAvailableBalance(Long customerId, Double availableBalance);
    Account findByCustomerIdAndBlockedBalance(Long customerId, Double blockedBalance);
    Account findByCustomerIdAndOverdraft(Long customerId, Double overdraft);
    Account findByCustomerIdAndOverdraftLimit(Long customerId, Double overdraftLimit);
    Account findByCustomerIdAndOverdraftLimitUsed(Long customerId, Double overdraftLimitUsed);
    
}
