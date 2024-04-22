package org.parking.gestio_parking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_parking;
    private String Adresse;
    private String Regions;
    private int Telephone;
    private int Prix;
    @OneToMany(mappedBy = "parking")
    private List<Place> places;
    @OneToOne
    private Admin admin;


}
