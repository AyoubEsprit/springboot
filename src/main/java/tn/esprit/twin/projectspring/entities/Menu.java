package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prixTotal;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToMany
    private List<Commande> commandes;

    @ManyToMany
    private List<Composant> composants;
}

