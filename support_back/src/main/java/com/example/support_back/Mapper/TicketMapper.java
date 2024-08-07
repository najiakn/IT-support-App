package com.example.support_back.Mapper;

import com.example.support_back.dto.TechnicienDto;
import com.example.support_back.dto.TicketDto;
import com.example.support_back.model.Technicien;
import com.example.support_back.model.Ticket;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")

public interface TicketMapper {
    Ticket toEntity(TicketDto DTO);
    TicketDto toDTO(Ticket entity);
    List<TicketDto> toDTOList(List<Ticket> tickets);
    List<Ticket> toEntityList(List<TicketDto> ticketDtos);
}
