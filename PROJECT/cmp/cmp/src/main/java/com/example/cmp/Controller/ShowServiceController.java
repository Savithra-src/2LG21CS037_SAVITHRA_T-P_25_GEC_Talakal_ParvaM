package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowServiceController {

    @GetMapping("/admin/services/showservice")
    public String showServicesPage() {
        return "showservice"; // Looks for src/main/resources/templates/showservice.html
    }
}
