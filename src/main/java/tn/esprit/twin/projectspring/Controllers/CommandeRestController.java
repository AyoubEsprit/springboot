package tn.esprit.twin.projectspring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin.projectspring.entities.Commande;
import tn.esprit.twin.projectspring.services.ICommandeServices;
import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/commande")
public class CommandeRestController {

    ICommandeServices commandeService;

    @GetMapping("/retrieve-all-commandes")
    public List<Commande> getCommandes() {
        return commandeService.retrieveAllCommandes();
    }

    @GetMapping("/retrieve-commande/{commande-id}")
    public Commande getCommande(@PathVariable("commande-id") Long id) {
        return commandeService.retrieveCommande(id);
    }

    @PostMapping("/add-commande")
    public Commande addCommande(@RequestBody Commande c) {
        return commandeService.addCommande(c);
    }

    @PutMapping("/update-commande")
    public Commande updateCommande(@RequestBody Commande c) {
        return commandeService.updateCommande(c);
    }

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
