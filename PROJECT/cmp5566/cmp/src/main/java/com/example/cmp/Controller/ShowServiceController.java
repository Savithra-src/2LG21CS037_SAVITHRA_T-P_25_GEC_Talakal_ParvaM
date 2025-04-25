package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class ShowServiceController {

    @GetMapping("/admin/services/showservice")
    public String showServicesPage() {
        return "showservice"; // Looks for src/main/resources/templates/showservice.html
    }
    @GetMapping("/services/show")
public String showServices(Model model) {
    // populate model with projects
    return "showservice"; // points to show.html
}
}
