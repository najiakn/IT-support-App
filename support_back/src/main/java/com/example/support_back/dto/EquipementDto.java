package com.example.support_back.dto;

import com.example.support_back.Enums.Etat_Equipement;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EquipementDto {
    private  int id;
    private String nom;
    private String description;
    private String marque;
    private String model;
    private Etat_Equipement etatEquipement;
}
