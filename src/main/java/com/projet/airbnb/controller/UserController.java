package com.projet.airbnb.controller;

import com.projet.airbnb.dao.UserDao;
import com.projet.airbnb.entities.User;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userDao.findAll();
    }

    @GetMapping("/all/{id}")
    public Optional<User> findOneUserBy(@PathVariable int id){
        return userDao.findById(id);
    }

    @PostMapping(value = "/add")
    public User insertUser(@RequestBody User user) {
        return userDao.save(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userDao.save(user);
    }

    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestBody User user) {
        userDao.delete(user);
        return true;
    }
}