package com.projet.airbnb.controller;

import com.projet.airbnb.dao.AnnonceDao;
import com.projet.airbnb.entities.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/annonce")
public class AnnonceController {

    @Autowired
    private AnnonceDao annonceDao;

    @GetMapping("/all")
    public List<Annonce> getAllAnnonces(){
        return annonceDao.findAll();
    }

    @GetMapping("/all/{id}")
    public Optional<Annonce> findOneAnnonceBy(@PathVariable int id){
        return annonceDao.findById(id);
    }

    @PostMapping("/add")
    public Annonce insertAnnonce(@RequestBody Annonce annonce) {
        return annonceDao.save(annonce);
    }

    @PutMapping("/update")
    public Annonce updateAnnonce(@RequestBody Annonce annonce) {
        return annonceDao.save(annonce);
    }

    @DeleteMapping("/delete")
    public boolean deleteAnnonce(@RequestBody Annonce annonce) {
        annonceDao.delete(annonce);
        return true;
    }
}