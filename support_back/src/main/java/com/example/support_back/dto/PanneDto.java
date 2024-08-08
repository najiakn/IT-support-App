package com.example.support_back.dto;

import com.example.support_back.Enums.Etat_panne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PanneDto {
    private String description;
    private   String nom;
    private String priorite;
    private String localisation;
    private Etat_panne etatPanne;
}
