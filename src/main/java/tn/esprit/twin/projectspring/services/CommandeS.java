package tn.esprit.twin.projectspring.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.twin.projectspring.entities.Commande;
import tn.esprit.twin.projectspring.repository.CommandeRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class CommandeS implements ICommandeServices {


    private CommandeRepository commandeRepository;

    @Override
    public List<Commande> retrieveAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande c) {
        return commandeRepository.save(c);
    }

    @Override
    public Commande updateCommande(Commande c) {
        return commandeRepository.save(c);
    }

    @Override
    public Commande retrieveCommande(Long idCommande) {
        return commandeRepository.findById(idCommande).orElse(null);
    }

    @Override
    public void removeCommande(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    @Override
    public List<Commande> findByDateCommande(LocalDate date) {
        return commandeRepository.findByDateCommande(date);
    }

    @Override
    public List<Commande> findCommandesWithHighRemise() {
        return commandeRepository.findCommandesWithHighRemise();
    }
}
