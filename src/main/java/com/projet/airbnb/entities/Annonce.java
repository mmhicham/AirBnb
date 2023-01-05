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
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnnonce;
    private double prix;
    private String datePublication;
    private String image;
    private int nbPieces;
    private String description;
    private String adresse;
    private String typeLogement;

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @JsonManagedReference
    @ToString.Exclude
    @OneToMany(targetEntity = Reservation.class, mappedBy = "annonce")
    private List<Reservation> reservations = new ArrayList<Reservation>();


}
