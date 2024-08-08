package com.example.support_back.service;

import com.example.support_back.dto.EquipementDto;
import com.example.support_back.model.Equipement;

import java.util.List;

public interface EquipementService {


    EquipementDto create(EquipementDto equipementDto);
    void delete(int id);
    List<EquipementDto> getAll();
    EquipementDto getEquipementById(int id);
    EquipementDto update(int id, EquipementDto equipementDto);
}
