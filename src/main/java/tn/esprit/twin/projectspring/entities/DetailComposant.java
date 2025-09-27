package tn.esprit.twin.projectspring.entities;

import jakarta.persistence.*;

@Entity
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

    @OneToOne
    private Composant composant;
}
