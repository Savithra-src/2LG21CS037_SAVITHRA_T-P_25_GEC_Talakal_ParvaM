package com.example.constructioncrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.constructioncrud.Model.Construction;
import com.example.constructioncrud.Repository.ConstructionRepository;
@Service
public class ConstructionService {
    @Autowired
    private ConstructionRepository repository;

    public List<Construction> getAllProjects() {
        return repository.findAll();
    }

    public Construction getProjectById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Construction addProject(Construction project) {
        return repository.save(project);
    }

    public Construction updateProject(Long id, Construction updatedProject) {
        return repository.findById(id).map(project -> {
            project.setProjectName(updatedProject.getProjectName());
            project.setLocation(updatedProject.getLocation());
            project.setContractor(updatedProject.getContractor());
            project.setBudget(updatedProject.getBudget());
            return repository.save(project);
        }).orElse(null);
    }

    public void deleteProject(Long id) {
        repository.deleteById(id);
    }
    
    
}
