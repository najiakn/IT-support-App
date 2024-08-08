package com.example.support_back.service;

import com.example.support_back.dto.PanneDto;
import com.example.support_back.dto.TicketDto;

import java.util.List;

public interface TicketService {
    TicketDto create(TicketDto ticketDto);
    void delete(int id);

    List<TicketDto> getAll();
    TicketDto getById(int id);
    TicketDto update(int id, TicketDto ticketDto);
}
