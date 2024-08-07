package com.example.support_back.Mapper;


import com.example.support_back.dto.EquipementDto;
import com.example.support_back.model.Equipement;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EquipementMapper {
    Equipement toEntity(EquipementDto DTO);
    EquipementDto toDTO(Equipement entity);
    List<EquipementDto> toDTOList(List<Equipement> equipements);
    List<Equipement> toEntityList(List<EquipementDto> equipementDtos);

}
