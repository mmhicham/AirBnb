package com.projet.airbnb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    private String dateDebut;

    private String dateFin;

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @OneToMany(targetEntity = Avis.class, mappedBy = "reservation")
    @ToString.Exclude
    private List<Avis> avis = new ArrayList<Avis>();

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "idAnnonce", nullable = false)
    private Annonce annonce;
}
