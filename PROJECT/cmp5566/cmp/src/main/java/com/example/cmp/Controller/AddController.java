package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AddController {
    @GetMapping("/admin/projects/add")
    public String showAddProjectPage() {
        return "add"; // Maps to src/main/resources/templates/add.html
    }
    
     
}

