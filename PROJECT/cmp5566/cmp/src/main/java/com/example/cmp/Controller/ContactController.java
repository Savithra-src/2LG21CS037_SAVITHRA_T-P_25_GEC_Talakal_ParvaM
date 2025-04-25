package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ContactController {
     @GetMapping("/contact")
    public String showContactPage() {
        return "contact"; // This maps to src/main/resources/templates/contact.html
    }
    
}
