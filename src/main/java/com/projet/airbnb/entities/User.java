package com.projet.airbnb.entities;

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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String nom;
    private String prenom;
    private String email;
    private String password;

    private String role;
    @JsonManagedReference
    @ToString.Exclude
    @OneToMany(targetEntity = Avis.class, mappedBy = "user")
    private List<Avis> avis = new ArrayList<Avis>();
    @JsonManagedReference
    @ToString.Exclude
    @OneToMany(targetEntity = Annonce.class, mappedBy = "user")
    private List<Annonce> annonces = new ArrayList<Annonce>();
    @JsonManagedReference
    @ToString.Exclude
    @OneToMany(targetEntity = Reservation.class, mappedBy = "user")
    private List<Reservation> reservations = new ArrayList<Reservation>();

}