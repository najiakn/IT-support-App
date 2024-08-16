package com.example.support_back.service;

import com.example.support_back.dto.EquipementDto;
import com.example.support_back.Enums.Etat_Equipement;
import com.example.support_back.model.Equipement;
import com.example.support_back.repository.EquipementRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EquipementServiceTest {

    @Mock
    private EquipementRepository equipementRepository;

    @InjectMocks
    private EquipementServiceImpl equipementService;

    private EquipementDto equipementDto;
    private Equipement equipement;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        equipement = new Equipement(1, "Laptop", "High performance laptop", "Dell", "XPS 15", Etat_Equipement.EnService);
    }

    @Test
    void create() {
        when(equipementRepository.save(any(Equipement.class))).thenReturn(equipement);

        EquipementDto createdEquipement = equipementService.create(equipementDto);

        assertNotNull(createdEquipement);
        assertEquals(equipementDto.getNom(), createdEquipement.getNom());
        verify(equipementRepository, times(1)).save(any(Equipement.class));
    }

    @Test
    void delete() {
        doNothing().when(equipementRepository).deleteById(equipement.getId());

        equipementService.delete(equipement.getId());

        verify(equipementRepository, times(1)).deleteById(equipement.getId());
    }

    @Test
    void getAll() {
        List<Equipement> equipements = Arrays.asList(equipement);
        when(equipementRepository.findAll()).thenReturn(equipements);

        List<EquipementDto> equipementDtos = equipementService.getAll();

        assertEquals(1, equipementDtos.size());
        verify(equipementRepository, times(1)).findAll();
    }

    @Test
    void getEquipementById() {
        when(equipementRepository.findById(equipement.getId())).thenReturn(Optional.of(equipement));

        EquipementDto foundEquipement = equipementService.getEquipementById(equipement.getId());

        assertNotNull(foundEquipement);
        assertEquals(equipementDto.getNom(), foundEquipement.getNom());
        verify(equipementRepository, times(1)).findById(equipement.getId());
    }

    @Test
    void update() {
        when(equipementRepository.findById(equipement.getId())).thenReturn(Optional.of(equipement));
        when(equipementRepository.save(any(Equipement.class))).thenReturn(equipement);

        EquipementDto updatedEquipement = equipementService.update(equipement.getId(), equipementDto);

        assertNotNull(updatedEquipement);
        assertEquals(equipementDto.getNom(), updatedEquipement.getNom());
        verify(equipementRepository, times(1)).findById(equipement.getId());
        verify(equipementRepository, times(1)).save(any(Equipement.class));
    }
}
