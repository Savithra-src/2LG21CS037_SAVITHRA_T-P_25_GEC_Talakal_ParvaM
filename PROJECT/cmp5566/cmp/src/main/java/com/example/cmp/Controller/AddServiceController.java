package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddServiceController {

    @GetMapping("/admin/services/addservice")
    public String showAddServicePage() {
        return "addservice"; // Loads src/main/resources/templates/addservice.html
    }
}