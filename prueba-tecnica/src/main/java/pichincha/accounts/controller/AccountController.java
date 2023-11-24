package pichincha.accounts.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    // Endpoint para obtener información de una cuenta por su ID
    @GetMapping("/{id}")
    public ResponseEntity<String> getAccountById(@PathVariable Long id) {
        // Lógica para obtener información de la cuenta con el ID proporcionado
        String accountInfo = "Información de la cuenta con ID " + id;
        return ResponseEntity.ok(accountInfo);
    }

    // Endpoint para crear una nueva cuenta
    @PostMapping
    public ResponseEntity<String> createAccount(@RequestBody String accountDetails) {
        // Lógica para crear una nueva cuenta con los detalles proporcionados
        String createdAccountInfo = "Cuenta creada con éxito: " + accountDetails;
        return ResponseEntity.ok(createdAccountInfo);
    }

    // Endpoint para actualizar la información de una cuenta
    @PutMapping("/{id}")
    public ResponseEntity<String> updateAccount(@PathVariable Long id, @RequestBody String updatedAccountDetails) {
        // Lógica para actualizar la información de la cuenta con el ID proporcionado
        String updatedAccountInfo = "Información de la cuenta con ID " + id + " actualizada: " + updatedAccountDetails;
        return ResponseEntity.ok(updatedAccountInfo);
    }

    // Endpoint para eliminar una cuenta por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id) {
        // Lógica para eliminar la cuenta con el ID proporcionado
        String deleteMessage = "Cuenta con ID " + id + " eliminada correctamente.";
        return ResponseEntity.ok(deleteMessage);
    }
}
