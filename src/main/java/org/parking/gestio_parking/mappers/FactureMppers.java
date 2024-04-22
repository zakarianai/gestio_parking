package org.parking.gestio_parking.mappers;

import org.parking.gestio_parking.Dto.FactureDto;
import org.parking.gestio_parking.entities.Facture;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class FactureMppers {
    public Facture fromFactureDto(FactureDto factureDto){
        Facture facture = new Facture();
        BeanUtils.copyProperties(factureDto,facture);
        return facture;
    }
    public FactureDto fromFacture(Facture facture){
        FactureDto factureDto=new FactureDto();
        BeanUtils.copyProperties(facture,factureDto);
        return factureDto;
    }
}
