package com.projet.airbnb.controller;

import com.projet.airbnb.dao.ReservationDao;
import com.projet.airbnb.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired
    private ReservationDao reservationDao;

    @GetMapping("/all")
    public List<Reservation> getAllReservation(){
        return reservationDao.findAll();
    }

    @GetMapping("/all/{id}")
    public Optional<Reservation> findOneReservationBy(@PathVariable int id){
        return reservationDao.findById(id);
    }

    @PostMapping("/add")
    public Reservation insertReservation(@RequestBody Reservation reservation) {
        return reservationDao.save(reservation);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationDao.save(reservation);
    }

    @DeleteMapping("/delete")
    public boolean deleteReservation(@RequestBody Reservation reservation) {
        reservationDao.delete(reservation);
        return true;
    }
}
