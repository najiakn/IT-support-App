package com.example.support_back.Mapper;


import com.example.support_back.dto.PanneDto;
import com.example.support_back.dto.PersonneDto;
import com.example.support_back.dto.TechnicienDto;
import com.example.support_back.model.Panne;
import com.example.support_back.model.Personne;
import com.example.support_back.model.Technicien;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface TechnicienMapper {
    Technicien toEntity(TechnicienDto DTO);
    TechnicienDto toDTO(Technicien entity);
    List<TechnicienDto> toDTOList(List<Technicien> techniciens);
    List<Technicien> toEntityList(List<TechnicienDto> technicienDtos);
}
