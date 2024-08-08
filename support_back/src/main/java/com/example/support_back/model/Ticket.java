package com.example.support_back.model;

import com.example.support_back.Enums.Ticket_statut;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description; // Conformément aux conventions Java
    private String priorite;
    private Date dateCreation; // Conformément aux conventions Java

    @Enumerated(EnumType.STRING)
    private Ticket_statut ticketStatut; // Conformément aux conventions Java

    @ManyToOne
    @JoinColumn(name = "id_uti", nullable = false)
    private Utilisateur user;

    @ManyToOne
    @JoinColumn(name = "id_tech", nullable = false)
    private Technicien technicien;

    @ManyToOne
    @JoinColumn(name = "id_panne", nullable = false)
    private Panne panne;

    @ManyToOne
    @JoinColumn(name = "id_equip", nullable = false)
    private Equipement equipement;
}
