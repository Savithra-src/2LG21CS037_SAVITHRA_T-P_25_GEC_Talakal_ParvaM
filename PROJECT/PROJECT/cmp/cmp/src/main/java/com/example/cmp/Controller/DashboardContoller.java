package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DashboardContoller {
    @GetMapping("/admin/dashboard")
    public String showDashboard() {
        return "dashboard"; // Maps to src/main/resources/templates/dashboard.html
    }
    
}
