package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;

    @ManyToMany(mappedBy = "chefs")
    private List<Commande> commandes;
}
