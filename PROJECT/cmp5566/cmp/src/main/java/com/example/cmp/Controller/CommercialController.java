package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CommercialController {
     @GetMapping("/projects/commercial")
    public String getCommercialProjects() {
        return "commercial"; // commercial.html should be in src/main/resources/templates
    }
    
   


}
