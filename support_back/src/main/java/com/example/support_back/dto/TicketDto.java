package com.example.support_back.dto;

import com.example.support_back.Enums.Ticket_statut;

public class TicketDto {

    private int id;
    private String description;
    private String priorite;
    private Ticket_statut ticketStatut;
    private int userId;
    private int technicienId;
    private int panneId;
    private int equipementId;

}
