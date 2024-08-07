package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository  extends JpaRepository<Utilisateur,Integer > {
}
