package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;


@Controller
public class AddController {
    @GetMapping("/admin/projects/add")
    public String showAddProjectPage() {
        return "add"; // Maps to src/main/resources/templates/add.html
    }
    
     @GetMapping("/projects/add")
public String addProjects(Model model) {
    // populate model with projects
    return "add"; // points to show.html
}
    
     
}

