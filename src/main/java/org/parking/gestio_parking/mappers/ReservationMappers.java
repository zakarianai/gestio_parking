package org.parking.gestio_parking.mappers;

import org.parking.gestio_parking.Dto.ReservationDto;
import org.parking.gestio_parking.entities.Reservation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ReservationMappers {
    public Reservation fromReservationDto (ReservationDto reservationDto){
        Reservation reservation=new Reservation();
        BeanUtils.copyProperties(reservationDto,reservation);
        return reservation;
    }
    public ReservationDto fromReservation (Reservation reservation){
        ReservationDto reservationDto=new ReservationDto();
        BeanUtils.copyProperties(reservation,reservationDto);
        return reservationDto;
    }
}
