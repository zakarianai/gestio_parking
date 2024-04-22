package org.parking.gestio_parking.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class AdminDto {
    private int inAdmin;
    private String Nom;
    private String Prenom;
    private int Telephone;
    private String Adresse_client;
    private String Nom_utilisateur;
    private String Email;

}
