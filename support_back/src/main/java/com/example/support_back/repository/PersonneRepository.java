package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonneRepository  extends JpaRepository<Personne,Integer > {
    Optional<Personne> findByMail(String username);
}
