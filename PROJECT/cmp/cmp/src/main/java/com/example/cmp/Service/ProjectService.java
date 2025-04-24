package com.example.cmp.Service;

import com.example.cmp.Model.Project;
import com.example.cmp.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Fetch all projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Fetch a project by ID
    public Project getProjectById(Long id) {
        Optional<Project> projectOpt = projectRepository.findById(id);
        return projectOpt.orElse(null);
    }

    // Save or update a project
    public void saveProject(Project project) {
        projectRepository.save(project);
    }

    // Delete a project by ID
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    // Optional: Get projects by type (e.g., Commercial, Residential)
    public List<Project> getProjectsByType(String type) {
        return projectRepository.findByType(type);
    }
}



