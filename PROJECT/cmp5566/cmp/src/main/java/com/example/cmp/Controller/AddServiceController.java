package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class AddServiceController {

    @GetMapping("/admin/services/addservice")
    public String showAddServicePage() {
        return "addservice"; // Loads src/main/resources/templates/addservice.html
    }
     @GetMapping("/services/add")
public String addServices(Model model) {
    // populate model with projects
    return "addservice"; // points to show.html
}
}