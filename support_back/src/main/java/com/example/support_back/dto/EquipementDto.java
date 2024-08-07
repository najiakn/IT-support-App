package com.example.support_back.dto;

import com.example.support_back.Enums.Etat_Equipement;
import lombok.Data;

@Data
public class EquipementDto {
    private int id;
    private String nom;
    private String description;
    private String marque;
    private String model;
    private Etat_Equipement etatEquipement;
}
