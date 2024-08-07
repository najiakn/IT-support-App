package com.example.support_back.Mapper;

import com.example.support_back.dto.AdminDto;
import com.example.support_back.dto.EquipementDto;
import com.example.support_back.model.Admin;
import com.example.support_back.model.Equipement;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipementMapper {
    Equipement toEntity(EquipementDto DTO);
    EquipementDto toDTO(Equipement entity);
    List<EquipementDto> toDTOList(List<Equipement> equipements);
    List<Equipement> toEntityList(List<EquipementDto> equipementDtos);
}
