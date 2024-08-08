package com.example.support_back.model;

import com.example.support_back.Enums.Etat_Equipement;
import com.example.support_back.Enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public  class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String mail;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
