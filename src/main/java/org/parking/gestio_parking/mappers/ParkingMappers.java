package org.parking.gestio_parking.mappers;

import org.parking.gestio_parking.Dto.ParkingDto;
import org.parking.gestio_parking.entities.Parking;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ParkingMappers {
    public Parking fromParkingDto(ParkingDto parkingDto){
        Parking parking=new Parking();
        BeanUtils.copyProperties(parkingDto,parking);
        return parking;
    }
    public ParkingDto fromParking (Parking parking){
        ParkingDto parkingDto = new ParkingDto();
        BeanUtils.copyProperties(parking,parkingDto);
        return parkingDto;
    }
}
