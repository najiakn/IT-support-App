package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Historique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueRepository  extends JpaRepository<Historique,Integer > {
}
