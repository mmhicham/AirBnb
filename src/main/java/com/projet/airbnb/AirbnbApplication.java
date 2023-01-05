package com.projet.airbnb;

import com.projet.airbnb.controller.UserController;
import com.projet.airbnb.dao.AnnonceDao;
import com.projet.airbnb.dao.AvisDao;
import com.projet.airbnb.dao.ReservationDao;
import com.projet.airbnb.dao.UserDao;
import com.projet.airbnb.entities.Annonce;
import com.projet.airbnb.entities.Avis;
import com.projet.airbnb.entities.Reservation;
import com.projet.airbnb.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AirbnbApplication implements CommandLineRunner {

    @Autowired
    public UserDao userDao;

    @Autowired
    public AvisDao avisDao;
    @Autowired
    public AnnonceDao annonceDao;
    @Autowired
    public ReservationDao reservationDao;

    public static void main(String[] args) {
        SpringApplication.run(AirbnbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//      List<Avis> avis = new ArrayList<Avis>();
//      List<Annonce> annonces = new ArrayList<Annonce>();
//      List<Reservation> reservations = new ArrayList<Reservation>();

        // FINDBYID
//        System.out.println(userDao.findById(1));

        // INSERT
//      User user = new User(12, "toto", "titi", "tototiti@gmail.com", "password8", "user", avis, annonces, reservations);
//      userDao.save(user);
//      List<User> listUser = userDao.findAll();
//      System.out.println(listUser);

        // DELETE
//        userDao.delete(user);

//        List<Avis> listAvis = avisDao.findAll();
//        System.out.println(listAvis);
//        System.out.println(avisDao.findById(1));

//        List<Annonce> listAnnonce = annonceDao.findAll();
//        System.out.println(listAnnonce);
//
//        System.out.println(annonceDao.findById(2));

//        List<Reservation> listReservation = reservationDao.findAll();
//        System.out.println(listReservation);
//
//       System.out.println(reservationDao.findById(2));

    }
}
