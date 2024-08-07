package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository  extends JpaRepository<Personne,Integer > {
}
