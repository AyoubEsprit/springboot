package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Date;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;
    private LocalDate datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
}

