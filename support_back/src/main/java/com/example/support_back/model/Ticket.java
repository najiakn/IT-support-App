package com.example.support_back.model;

import com.example.support_back.model.Enums.Ticket_statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String Description;
    private String priorite;
    @Enumerated(EnumType.STRING)
    private Ticket_statut ticket_statut;
    @ManyToOne
    @JoinColumn(name = "id_uti",nullable = false)
    private Utilisateur user;
    @ManyToOne
    @JoinColumn(name = "id_tech",nullable = false)
    private Technicien technicien;
    @ManyToOne
    @JoinColumn(name = "id_panne",nullable = false)
    private Panne panne;

    @ManyToOne
    @JoinColumn(name = "id_equip",nullable = false)
    private Equipement equipement;

}
