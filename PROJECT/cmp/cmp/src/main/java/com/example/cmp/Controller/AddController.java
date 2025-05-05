package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.cmp.Model.Project;

import ch.qos.logback.core.model.Model;


@Controller
public class AddController {
    @GetMapping("/admin/projects/add")
    public String showAddProjectsPage() {
        return "add"; // Maps to src/main/resources/templates/add.html
    }
   
    
     @GetMapping("/projects/add")
public String addProjects(Model model) {
    // populate model with projects
    return "add"; // points to show.html
}
@PostMapping("/projects/save")
public String saveProject(@ModelAttribute Project project, @RequestParam("image") MultipartFile file) {
    // save project logic here
    return "redirect:/projects/show"; // after saving, redirect to show.html
}

    
     
}

