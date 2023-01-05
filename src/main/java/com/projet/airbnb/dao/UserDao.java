package com.projet.airbnb.dao;

import com.projet.airbnb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
