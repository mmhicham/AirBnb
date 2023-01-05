package com.projet.airbnb.controller;
import com.projet.airbnb.dao.AvisDao;
import com.projet.airbnb.entities.Avis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/avis")
public class AvisController {

    @Autowired
    private AvisDao avisDao;

    @GetMapping("/all")
    public List<Avis> getAllAvis(){
        return avisDao.findAll();
    }

    @GetMapping("/all/{id}")
    public Optional<Avis> findOneAvisBy(@PathVariable int id){
        return avisDao.findById(id);
    }

    @PostMapping("/add")
    public Avis insertAvis(@RequestBody Avis avis) {
        return avisDao.save(avis);
    }

    @PutMapping("/update")
    public Avis updateAvis(@RequestBody Avis avis) {
        return avisDao.save(avis);
    }

    @DeleteMapping("/delete")
    public boolean deleteAvis(@RequestBody Avis avis) {
        avisDao.delete(avis);
        return true;
    }
}
