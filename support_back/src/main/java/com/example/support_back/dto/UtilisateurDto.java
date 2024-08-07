package com.example.support_back.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class UtilisateurDto extends PersonneDto implements Serializable {

    private String telephone;
    private String adresse;
    private String genre;


}
