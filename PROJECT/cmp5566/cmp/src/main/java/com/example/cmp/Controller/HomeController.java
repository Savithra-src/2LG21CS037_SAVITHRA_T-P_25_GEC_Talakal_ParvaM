package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index"; // Thymeleaf template name
    }
    @GetMapping("/about")
    public String getAboutPage() {
        return "about";
    }

    @GetMapping("/services")
    public String getServicePage() {
        return "service"; // service.html should be located under src/main/resources/templates
    }
}
