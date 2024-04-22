package org.parking.gestio_parking.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.parking.gestio_parking.Dto.AdminDto;
import org.parking.gestio_parking.Exceptions.ExceptionAdminNotFound;
import org.parking.gestio_parking.entities.Admin;
import org.parking.gestio_parking.mappers.AdminMappers;
import org.parking.gestio_parking.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Service
@AllArgsConstructor
@NoArgsConstructor
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private AdminMappers adminMappers;

    @Override

    public AdminDto SaveAdmin(AdminDto adminDto) {
        System.out.println("hello");
        Admin admin =adminMappers.fromAdminDto(adminDto);
        Admin admin1=adminRepository.save(admin);
        return adminMappers.fromAdmin(admin1);

    }

    @Override
    public AdminDto UpdateAdmin(int id, AdminDto adminDto) throws ExceptionAdminNotFound {
        Admin admin = adminRepository.findById(id).orElseThrow(()->new ExceptionAdminNotFound("Admin not found"));
        AdminDto adminDto1= adminMappers.fromAdmin(admin);
        adminDto1.setPrenom(adminDto.getPrenom());
        adminDto1.setNom(adminDto.getNom());
        adminDto1.setEmail(adminDto.getEmail());
        adminDto1.setNom_utilisateur(adminDto.getNom_utilisateur());
        adminDto1.setTelephone(adminDto.getTelephone());
        adminDto1.setAdresse_client(adminDto.getAdresse_client());
        return adminDto1;
    }

    @Override
    public void DeleteAdmin(int id) {
        adminRepository.deleteById(id);

    }

    @Override
    public List<AdminDto> ListeAdmin() {
        List<Admin> liste =adminRepository.findAll();
        List<AdminDto> liste1=liste.stream().map(admin -> adminMappers.fromAdmin(admin)).collect(Collectors.toList());
        return liste1;
    }

    @Override
    public AdminDto AdminById(int id) throws ExceptionAdminNotFound {
        Admin admin = adminRepository.findById(id).orElseThrow(()-> new ExceptionAdminNotFound("Admin Not Found"));
        return adminMappers.fromAdmin(admin);
    }
}
