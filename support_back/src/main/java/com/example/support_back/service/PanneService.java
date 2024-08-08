package com.example.support_back.service;

import com.example.support_back.dto.EquipementDto;
import com.example.support_back.dto.PanneDto;

import java.util.List;

public interface PanneService {
    PanneDto create(PanneDto panneDto);
    void delete(int id);
    List<PanneDto> getAll();
    PanneDto getPanneById(int id);
    PanneDto update(int id, PanneDto panneDto);
}
