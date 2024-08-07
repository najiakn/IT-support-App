package com.example.support_back.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Historique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "equipment_id",nullable = false)
    private Equipement equipment;
    @ManyToOne
    @JoinColumn(name = "panne_id",nullable = false)
    private Panne panne;



}