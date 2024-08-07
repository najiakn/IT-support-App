package com.example.support_back.service;

import com.example.support_back.Mapper.EquipementMapper;
import com.example.support_back.dto.EquipementDto;
import com.example.support_back.model.Equipement;
import com.example.support_back.repository.EquipementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EquipementServiceImpl implements EquipementService {
    @Autowired
    private EquipementRepository equipementRepository;

    @Autowired
    private EquipementMapper equipementMapper;


    @Override
    public EquipementDto create(EquipementDto equipementDto) {
       Equipement equipement = equipementMapper.toEntity(equipementDto);
       Equipement savedEquipement=equipementRepository.save(equipement);
       return  equipementMapper.toDTO(savedEquipement);
    }



    @Override
    public void delete(int id) {
        equipementRepository.deleteById(id);
    }


    @Override
    public List<EquipementDto> getAll() {
        List<Equipement> equipements = equipementRepository.findAll();
        return equipements.stream()
                .map(equipementMapper::toDTO)
                .collect(Collectors.toList());
    }


    @Override
    public EquipementDto getUserById(int id) {
        Optional<Equipement> equipement = equipementRepository.findById(id);
        return equipement.map(equipementMapper::toDTO).orElse(null);
    }

    @Override
    public EquipementDto update(int id, EquipementDto equipementDto) {
        Optional<Equipement> optionalEquipement = equipementRepository.findById(id);
        if (optionalEquipement.isPresent()) {
            Equipement equipement = optionalEquipement.get();
            equipement.setNom(equipementDto.getNom());
            equipement.setModel(equipementDto.getModel());
            equipement.setMarque(equipementDto.getMarque());
            equipement.setDescription(equipementDto.getDescription());
            equipement.setEtatEquipement(equipementDto.getEtatEquipement());


            Equipement updateEquipement = equipementRepository.save(equipement);
            return equipementMapper.toDTO(updateEquipement);
        } else {
            return null;
        }
    }
}