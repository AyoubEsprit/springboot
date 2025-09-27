package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;

    @ManyToOne
    private Client client;

    @ManyToMany(mappedBy = "commandes")
    private List<Menu> menus;

    @ManyToMany
    private List<ChefCuisinier> chefs;
}

