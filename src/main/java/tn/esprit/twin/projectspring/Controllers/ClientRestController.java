package tn.esprit.twin.projectspring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.projectspring.entities.Client;
import tn.esprit.twin.projectspring.services.IClientServices;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/client")
public class ClientRestController {

  IClientServices clientService;

  @GetMapping("/retrieve-all-clients")
  public List<Client> getClients() {
    return clientService.retrieveALLClients();
  }

  @GetMapping("/retrieve-client/{client-id}")
  public Client getClient(@PathVariable("client-id") Long id) {
    return clientService.retrieveClient(id);
  }

  @PostMapping("/add-client")
  public Client addClient(@RequestBody Client c) {
    return clientService.addClient(c);
  }

  @PutMapping("/update-client")
  public Client updateClient(@RequestBody Client c) {
    return clientService.updateClient(c);
  }

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
