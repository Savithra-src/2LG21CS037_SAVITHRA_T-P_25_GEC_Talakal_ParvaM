package com.example.cmp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class ShowTestimonialController {

    @GetMapping("/admin/testimonials/showtestimonial")
    public String showTestimonialsPage() {
        return "showtestimonial"; // Loads templates/showtestimonial.html
    }
    @GetMapping("/testimonials/show")
public String showTestimonials(Model model) {
    // populate model with projects
    return "showtestimonial"; // points to show.html
}
}
