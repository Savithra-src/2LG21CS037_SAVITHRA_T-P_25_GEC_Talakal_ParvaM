package com.example.cmp.Repository;

import com.example.cmp.Model.Admin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    // Custom finder method for login authentication
    Admin findByUsername(String username);

    Optional<Admin> findByUsernameAndPassword(String username, String password);

    Optional<Admin> findByEmailAndPassword(String email, String password);
}
