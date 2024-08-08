package com.example.support_back.model;

import com.example.support_back.Enums.Etat_panne;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
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
