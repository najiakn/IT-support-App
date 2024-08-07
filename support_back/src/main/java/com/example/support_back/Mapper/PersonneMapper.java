package com.example.support_back.Mapper;


import com.example.support_back.dto.PanneDto;
import com.example.support_back.dto.PersonneDto;
import com.example.support_back.model.Panne;
import com.example.support_back.model.Personne;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface PersonneMapper {
    Personne toEntity(PersonneDto DTO);
    PanneDto toDTO(Panne entity);
    List<PanneDto> toDTOList(List<Panne> pannes);
    List<Panne> toEntityList(List<PanneDto> panneDtos);
}
