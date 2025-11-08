package tn.esprit.twin.projectspring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.projectspring.entities.Commande;
import tn.esprit.twin.projectspring.services.ICommandeServices;
import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@Tag(name = "Gestion des commandes")
@RequestMapping("/api/commande")
public class CommandeRestController {

    ICommandeServices commandeService;

    @Operation(description = "Récupérer tous les commandes de la base de données")
    @GetMapping("/retrieve-all-commandes")
    public List<Commande> getCommandes() {
        return commandeService.retrieveAllCommandes();
    }

    @GetMapping("/retrieve-commande/{commande-id}")
    public Commande getCommande(@PathVariable("commande-id") Long id) {
        return commandeService.retrieveCommande(id);
    }

    @Operation(description = "Ajouter une nouvelle commande")
    @PostMapping("/add-commande")
    public Commande addCommande(@RequestBody Commande c) {
        return commandeService.addCommande(c);
    }

    @Operation(description = "Mettre à jour une commande existante")
    @PutMapping("/update-commande")
    public Commande updateCommande(@RequestBody Commande c) {
        return commandeService.updateCommande(c);
    }

    @Operation(description = "Supprimer une commande par ID")
    @DeleteMapping("/remove-commande/{commande-id}")
    public void removeCommande(@PathVariable("commande-id") Long id) {
        commandeService.removeCommande(id);
    }

    @GetMapping("/by-date/{date}")
    public List<Commande> getByDate(@PathVariable String date) {
        return commandeService.findByDateCommande(LocalDate.parse(date));
    }

    @GetMapping("/high-remise")
    public List<Commande> getHighRemise() {
        return commandeService.findCommandesWithHighRemise();
    }
}
