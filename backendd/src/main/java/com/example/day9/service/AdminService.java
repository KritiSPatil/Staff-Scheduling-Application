package com.example.day9.service;

import com.example.day9.model.Admin;
import com.example.day9.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Optional<Admin> getAdminById(long id) {
        return adminRepository.findById(id);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(long id, Admin adminDetails) {
        Admin admin = adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin not found"));
        admin.setUsername(adminDetails.getUsername());
        admin.setPassword(adminDetails.getPassword());
        return adminRepository.save(admin);
    }

    public void deleteAdmin(long id) {
        adminRepository.deleteById(id);
    }
}
