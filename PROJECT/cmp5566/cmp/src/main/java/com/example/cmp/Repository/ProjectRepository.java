package com.example.cmp.Repository;

import com.example.cmp.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    // Optional: find projects by type (e.g., "Commercial", "Residential")
    List<Project> findByType(String type);
}


    