package com.example.support_back.Mapper;



import com.example.support_back.dto.PersonneDto;
import com.example.support_back.model.Personne;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonneMapper {
    Personne toEntity(PersonneDto DTO);
    PersonneDto toDTO(Personne entity);
    List<PersonneDto> toDTOList(List<Personne> personnes);
    List<Personne> toEntityList(List<PersonneDto> personneDtos);
}
