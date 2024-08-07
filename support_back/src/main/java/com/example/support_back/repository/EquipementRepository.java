package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository  extends JpaRepository<Equipement,Integer > {
}
