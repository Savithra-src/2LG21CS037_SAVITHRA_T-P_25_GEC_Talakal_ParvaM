package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
@Controller
public class ShowController {
      @GetMapping("/admin/projects/show")
    public String showProjectsPage() {
        return "show"; // Loads templates/show.html
    }
    @GetMapping("/projects/show")
public String showProjects(Model model) {
    // populate model with projects
    return "show"; // points to show.html
}
}
