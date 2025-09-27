package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;

@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;
    private Float prix;

    @OneToOne(mappedBy = "composant")
    private DetailComposant detailComposant;
}
