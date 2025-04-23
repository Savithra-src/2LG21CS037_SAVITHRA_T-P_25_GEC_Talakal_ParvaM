package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResedentialController {
     @GetMapping("/projects/resedential")
    public String getResedentialProjects() {
        return "resedential"; // commercial.html should be in src/main/resources/templates
    }
    
}
