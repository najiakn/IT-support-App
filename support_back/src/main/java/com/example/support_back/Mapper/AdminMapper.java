package com.example.support_back.Mapper;

import com.example.support_back.dto.AdminDto;
import com.example.support_back.model.Admin;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    Admin toEntity(AdminDto DTO);
    AdminDto toDTO(Admin entity);
    List<AdminDto> toDTOList(List<Admin> admin);
    List<Admin> toEntityList(List<AdminDto> adminDtos);
}
