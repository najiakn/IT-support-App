package com.example.support_back.model;

import com.example.support_back.model.Enums.Etat_Equipement;
import com.example.support_back.model.Enums.Ticket_statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private   int id;
    private  String nom;
    private String description;
    private String marque;
    private String model;
    @Enumerated(EnumType.STRING)
    private Etat_Equipement etatEquipement;
}


