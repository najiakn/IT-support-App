package com.example.support_back.service;

import com.example.support_back.Mapper.TicketMapper;
import com.example.support_back.dto.PanneDto;
import com.example.support_back.dto.TicketDto;
import com.example.support_back.model.Panne;
import com.example.support_back.model.Ticket;
import com.example.support_back.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketMapper ticketMapper;

    @Override
    public TicketDto create(TicketDto ticketDto) {
        Ticket ticket = ticketMapper.toEntity(ticketDto);
        Ticket savedTicket = ticketRepository.save(ticket);
        return ticketMapper.toDTO(savedTicket);
    }

    @Override
    public void delete(int id) {
        ticketRepository.deleteById(id);
    }


    @Override
    public List<TicketDto> getAll() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets.stream()
                .map(ticketMapper::toDTO)
                .collect(Collectors.toList());
    }



    @Override
    public TicketDto getById(int id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        return ticket.map(ticketMapper::toDTO).orElse(null);
    }

    @Override
    public TicketDto update(int id, TicketDto ticketDto) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        if (optionalTicket.isPresent()) {
            Ticket ticket = optionalTicket.get();
            ticket.setDescription(ticketDto.getDescription());
            ticket.setPriorite(ticketDto.getPriorite());
            ticket.setTicketStatut(ticketDto.getTicketStatut());

            // Update relationships if necessary
            // Example: ticket.setUser(new User(ticketDto.getUserId()));
            // Similarly for other relationships

            Ticket updatedTicket = ticketRepository.save(ticket);
            return ticketMapper.toDTO(updatedTicket);
        } else {
            return null;
        }
    }
}
