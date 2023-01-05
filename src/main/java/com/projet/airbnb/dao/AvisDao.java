package com.projet.airbnb.dao;

import com.projet.airbnb.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisDao extends JpaRepository<Avis, Integer> {
}
