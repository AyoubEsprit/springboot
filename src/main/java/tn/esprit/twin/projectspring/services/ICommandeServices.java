package tn.esprit.twin.projectspring.services;

import tn.esprit.twin.projectspring.entities.Commande;
import java.util.List;

public interface ICommandeServices {

    List<Commande> retrieveAllCommandes();

    Commande addCommande(Commande c);

    Commande updateCommande(Commande c);

    Commande retrieveCommande(Long idCommande);

    void removeCommande(Long idCommande);

    List<Commande> addCommandes(List<Commande> commandes);

    List<Commande> findByDateCommande(java.time.LocalDate date);
    List<Commande> findCommandesWithHighRemise();
}
