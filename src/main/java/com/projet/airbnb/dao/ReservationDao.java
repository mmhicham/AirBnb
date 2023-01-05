package com.projet.airbnb.dao;

import com.projet.airbnb.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDao extends JpaRepository<Reservation, Integer> {

}
