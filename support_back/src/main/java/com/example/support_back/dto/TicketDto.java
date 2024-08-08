package com.example.support_back.dto;

import com.example.support_back.Enums.Ticket_statut;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TicketDto {

    private String description; // Conformément aux conventions Java
    private String priorite;
    private Date dateCreation; // Conformément aux conventions Java
    private Ticket_statut ticketStatut;
    private int idUti; // Conformément aux conventions Java
    private int idTech; // Conformément aux conventions Java
    private int idPanne; // Conformément aux conventions Java
    private int idEquip; // Conformément aux conventions Java
}
