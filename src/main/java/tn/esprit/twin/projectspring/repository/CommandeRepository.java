package tn.esprit.twin.projectspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.twin.projectspring.entities.Commande;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

    List<Commande> findByDateCommande(LocalDate dateCommande);


    @Query("SELECT c FROM Commande c WHERE c.pourcentageRemise > 10")
    List<Commande> findCommandesWithHighRemise();
}
