package org.parking.gestio_parking.Dto;

import org.parking.gestio_parking.entities.Parking;
import org.parking.gestio_parking.num.Etatplace;

public class PlaceDto {
    private int Id_Place;
    private int Num_place;
    private Etatplace etatplace;
    private ParkingDto parkingDto ;

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

    public ParkingDto getParkingDto() {
        return parkingDto;
    }

    public void setParkingDto(ParkingDto parkingDto) {
        this.parkingDto = parkingDto;
    }
}
