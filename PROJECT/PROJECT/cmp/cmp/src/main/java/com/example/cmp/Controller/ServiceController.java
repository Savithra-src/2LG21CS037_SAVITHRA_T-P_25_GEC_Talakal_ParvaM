package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ServiceController {
    @GetMapping("/services")
    public String getServicePage() {
        return "service"; // service.html should be located under src/main/resources/templates
    }
    
}
