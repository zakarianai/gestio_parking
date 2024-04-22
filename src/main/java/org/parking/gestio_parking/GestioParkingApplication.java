package org.parking.gestio_parking;

import org.parking.gestio_parking.Dto.ClientDto;
import org.parking.gestio_parking.Exceptions.ExceptionClientNotfound;
import org.parking.gestio_parking.services.ClientService;
import org.parking.gestio_parking.services.ClientServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class GestioParkingApplication {

    public static void main(String[] args)  {
        SpringApplication.run(GestioParkingApplication.class, args);
        /*ClientServiceImpl clientService= new ClientServiceImpl();
        int id =1;
        String Nom = "hello";
        ClientDto clientdto = new ClientDto();
        clientdto.setNom(Nom);
        clientdto.setEmail(Nom + "@gmail.com");
        clientdto.setPrenom(Nom + "Pre");
        clientdto.setTelephone(0000000);
        clientdto.setNom_utilisateur("ut" + Nom);
        clientdto.setAdresse_client("adresse" + Nom);

        System.out.println(clientService.ClientById(id));
        clientService.SaveClient(clientdto);
        */


    }
    @Bean
    CommandLineRunner commandLineRunner(ClientService clientService){
        return args -> {

            System.out.println("etape1==============================================================");
            ClientDto clientdto = new ClientDto();
            clientdto.setNom("ZAK");
            clientdto.setEmail("ZAK@gmail.com");
            clientdto.setPrenom("ZAK Pre");
            clientdto.setTelephone(0000000);
            clientdto.setNom_utilisateur("ut ZAK");
            clientdto.setAdresse_client("adresse ZAK");
            System.out.println("etape2==============================================================");
            clientService.SaveClient(clientdto);

        };



    }

}
