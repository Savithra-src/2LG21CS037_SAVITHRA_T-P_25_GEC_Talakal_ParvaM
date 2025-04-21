package com.example.constructioncrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.constructioncrud.Model.Construction;

public interface ConstructionRepository extends JpaRepository<Construction, Long> {
}