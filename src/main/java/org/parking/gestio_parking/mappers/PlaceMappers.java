package org.parking.gestio_parking.mappers;

import org.parking.gestio_parking.Dto.PlaceDto;
import org.parking.gestio_parking.entities.Place;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PlaceMappers {
    public Place fromPlaceDto(PlaceDto placeDto){
        Place place = new Place();
        BeanUtils.copyProperties(placeDto,place);
        return place;
    }
    public PlaceDto fromPlace(Place place){
        PlaceDto placeDto = new PlaceDto();
        BeanUtils.copyProperties(place,placeDto);
        return placeDto;
    }
}
