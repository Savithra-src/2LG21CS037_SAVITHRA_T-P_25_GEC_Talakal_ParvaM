package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class AddTestimonialController {

    @GetMapping("/admin/testimonials/addtestimonial")
    public String showAddTestimonialPage() {
        return "addtestimonial"; // Renders src/main/resources/templates/addtestimonial.html
    }
     @GetMapping("/testimonials/add")
public String addTestimonials(Model model) {
    // populate model with projects
    return "addtestimonial"; // points to show.html
}

}

