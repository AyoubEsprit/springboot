package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    private ChaineRestauration chaineRestauration;

    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menus;
}
