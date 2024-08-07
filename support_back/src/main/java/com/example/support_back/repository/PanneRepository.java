package com.example.support_back.repository;

import com.example.support_back.model.Admin;
import com.example.support_back.model.Panne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanneRepository  extends JpaRepository<Panne,Integer > {
}
