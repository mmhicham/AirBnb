package com.projet.airbnb.dao;

import com.projet.airbnb.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceDao extends JpaRepository<Annonce, Integer> {
}
