package com.example.support_back.Mapper;

import com.example.support_back.dto.EquipementDto;
import com.example.support_back.dto.HistoriqueDto;
import com.example.support_back.model.Equipement;
import com.example.support_back.model.Historique;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoriqueMapper {
    Historique toEntity(HistoriqueDto DTO);
    HistoriqueDto toDTO(Historique entity);
    List<HistoriqueDto> toDTOList(List<Historique> historiques);
    List<Historique> toEntityList(List<HistoriqueDto> historiqueDtos);
}
