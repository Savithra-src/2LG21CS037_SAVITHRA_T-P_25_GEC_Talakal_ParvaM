package com.example.cmp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BlogController {
    @GetMapping("/blog")
    public String showBlogPage() {
        return "blog"; // Looks for src/main/resources/templates/blog.html
    }
    
}
