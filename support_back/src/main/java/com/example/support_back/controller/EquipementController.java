package com.example.support_back.controller;

import com.example.support_back.dto.EquipementDto;
import com.example.support_back.service.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipements")
public class EquipementController {

    @Autowired
    private EquipementService equipementService;

    @PostMapping("/create-equipment")
    public ResponseEntity<?> createEquipment(@RequestBody EquipementDto equipmentDto) {
        try {
            var equipment = equipementService.create(equipmentDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(equipment);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEquipement(@PathVariable int id) {
        equipementService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<EquipementDto>> getAllEquipements() {
        List<EquipementDto> equipements = equipementService.getAll();
        return ResponseEntity.ok(equipements);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipementDto> getEquipementById(@PathVariable int id) {
        EquipementDto equipement = equipementService.getUserById(id);
        if (equipement != null) {
            return ResponseEntity.ok(equipement);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipementDto> updateEquipement(@PathVariable int id, @RequestBody EquipementDto equipementDto) {
        EquipementDto updatedEquipement = equipementService.update(id, equipementDto);
        if (updatedEquipement != null) {
            return ResponseEntity.ok(updatedEquipement);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
