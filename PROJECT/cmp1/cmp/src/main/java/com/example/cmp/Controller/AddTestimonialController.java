package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddTestimonialController {

    @GetMapping("/admin/testimonials/addtestimonial")
    public String showAddTestimonialPage() {
        return "addtestimonial"; // Renders src/main/resources/templates/addtestimonial.html
    }

}

