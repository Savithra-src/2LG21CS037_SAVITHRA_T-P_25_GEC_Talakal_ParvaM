package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ShowController {
      @GetMapping("/admin/projects/show")
    public String showProjectsPage() {
        return "show"; // Loads templates/show.html
    }
    
}
