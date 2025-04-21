package com.example.constructioncrud.Controller;

import com.example.constructioncrud.Model.Construction;
import com.example.constructioncrud.Service.ConstructionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConstructionController {

    @Autowired
    private ConstructionService service;

    // ✅ Show all projects
    @GetMapping("/")
    public String viewProjects(Model model) {
        model.addAttribute("projectList", service.getAllProjects());
        return "project_list"; // HTML file name (project_list.html)
    }

    // ✅ Show add form
    @GetMapping("/add_project")
    public String showAddForm(Model model) {
        model.addAttribute("project", new Construction());
        return "add_project"; // HTML file name (add_project.html)
    }

    // ✅ Handle form submission
    @PostMapping("/add")
    public String addProject(@ModelAttribute Construction project) {
        service.addProject(project);
        return "redirect:/";
    }

    // ✅ Delete a project
    @PostMapping("/delete/{id}")
    public String deleteProject(@PathVariable Long id) {
        service.deleteProject(id);
        return "redirect:/";
    }
}
