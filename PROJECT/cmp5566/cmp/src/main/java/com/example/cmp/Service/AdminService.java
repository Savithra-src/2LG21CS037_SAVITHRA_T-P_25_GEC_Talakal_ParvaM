package com.example.cmp.Service;

import com.example.cmp.Model.Admin;
import com.example.cmp.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Optional<Admin> validateAdmin(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }

    // Optional: validate using email instead
    public Optional<Admin> validateByEmail(String email, String password) {
        return adminRepository.findByEmailAndPassword(email, password);
    }

    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }
}
