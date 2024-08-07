package com.example.support_back.model;

import com.example.support_back.Enums.Etat_panne;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Panne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
   private String description;
    private   String nom;
    private String priorite;
    private String localisation;
    @Enumerated(EnumType.STRING)
    private Etat_panne etatPanne;

}
