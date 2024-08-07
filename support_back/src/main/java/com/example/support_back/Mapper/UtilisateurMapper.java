package com.example.support_back.Mapper;

import com.example.support_back.dto.TicketDto;
import com.example.support_back.dto.UtilisateurDto;
import com.example.support_back.model.Ticket;
import com.example.support_back.model.Utilisateur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface UtilisateurMapper {
    Utilisateur toEntity(UtilisateurDto DTO);
    UtilisateurDto toDTO(Utilisateur entity);
    List<UtilisateurDto> toDTOList(List<Utilisateur> utilisateurs);
    List<Utilisateur> toEntityList(List<UtilisateurDto> utilisateurDtos);
}
