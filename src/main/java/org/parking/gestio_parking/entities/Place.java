package org.parking.gestio_parking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.parking.gestio_parking.num.Etatplace;

import java.util.Date;
@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Place;
    private int Num_place;
    private Etatplace etatplace;
    @ManyToOne
    private Parking parking ;



    public Place() {
    }

    public Place(int num_place, Etatplace etatplace) {

        Num_place = num_place;
        this.etatplace = etatplace;
    }





    public int getId_Place() {
        return Id_Place;
    }

    public void setId_Place(int id_Place) {
        Id_Place = id_Place;
    }

    public int getNum_place() {
        return Num_place;
    }

    public void setNum_place(int num_place) {
        Num_place = num_place;
    }

    public Etatplace getEtatplace() {
        return etatplace;
    }

    public void setEtatplace(Etatplace etatplace) {
        this.etatplace = etatplace;
    }


}
