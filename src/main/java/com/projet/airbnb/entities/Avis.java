package com.projet.airbnb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAvis;
    private String commentaire;
    private double nbEtoiles;

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    @ManyToOne
    @JsonBackReference
    @ToString.Exclude
    @JoinColumn(name = "idReservation", nullable = false)
    private Reservation reservation;
}
