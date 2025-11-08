package tn.esprit.twin.projectspring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.projectspring.entities.Client;
import tn.esprit.twin.projectspring.services.IClientServices;
import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Gestion des clients")
@RequestMapping("/api/client")
public class ClientRestController {

  IClientServices clientService;

  @Operation(description = "Récupérer tous les clients de la base de données")
  @GetMapping("/retrieve-all-clients")
  public List<Client> getClients() {
    return clientService.retrieveALLClients();
  }

  @GetMapping("/retrieve-client/{client-id}")
  public Client getClient(@PathVariable("client-id") Long id) {
    return clientService.retrieveClient(id);
  }

  @Operation(description = "Ajouter un nouveau client")
  @PostMapping("/add-client")
  public Client addClient(@RequestBody Client c) {
    return clientService.addClient(c);
  }

  @Operation(description = "Mettre à jour un client existant")
  @PutMapping("/update-client")
  public Client updateClient(@RequestBody Client c) {
    return clientService.updateClient(c);
  }

  @Operation(description = "Supprimer un client par ID")
  @DeleteMapping("/remove-client/{client-id}")
  public void removeClient(@PathVariable("client-id") Long id) {
    clientService.removeClient(id);
  }

  @GetMapping("/by-identifiant/{identifiant}")
  public List<Client> getByIdentifiant(@PathVariable String identifiant) {
    return clientService.findByIdentifiant(identifiant);
  }

  @GetMapping("/many-commandes")
  public List<Client> getManyCommandes() {
    return clientService.findClientsWithManyCommandes();
  }
}
