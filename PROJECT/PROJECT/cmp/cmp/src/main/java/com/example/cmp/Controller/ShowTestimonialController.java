package com.example.cmp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowTestimonialController {

    @GetMapping("/admin/testimonials/showtestimonial")
    public String showTestimonialsPage() {
        return "showtestimonial"; // Loads templates/showtestimonial.html
    }
}
