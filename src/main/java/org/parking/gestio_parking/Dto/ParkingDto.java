package org.parking.gestio_parking.Dto;

public class ParkingDto {
    private int Id_parking;
    private String Adresse;
    private String Regions;
    private int Telephone;
    private int Prix;

    public int getId_parking() {
        return Id_parking;
    }

    public void setId_parking(int id_parking) {
        Id_parking = id_parking;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getRegions() {
        return Regions;
    }

    public void setRegions(String regions) {
        Regions = regions;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        Prix = prix;
    }
}
