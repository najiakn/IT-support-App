package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Technicien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicienRepository  extends JpaRepository<Technicien,Integer > {
}
