package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TestimonialController {
    @GetMapping("/testimonial")
    public String showTestimonialPage() {
        return "testimonial"; // Looks for src/main/resources/templates/testimonial.html
    }
    
}
