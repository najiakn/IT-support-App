package com.example.support_back.model;

import com.example.support_back.Enums.Etat_Equipement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private String description;
    private String marque;
    private String model;
    @Enumerated(EnumType.STRING)
    private Etat_Equipement etatEquipement;
}


