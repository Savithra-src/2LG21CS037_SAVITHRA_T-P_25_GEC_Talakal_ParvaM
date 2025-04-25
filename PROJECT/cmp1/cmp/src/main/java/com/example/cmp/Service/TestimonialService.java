package com.example.cmp.Service;

import com.example.cmp.Model.Testimonial;
import com.example.cmp.Repository.TestimonialRepository;

import java.util.List;
import java.util.Optional;

public class TestimonialService {

    private final TestimonialRepository testimonialRepository;

    // Constructor-based manual injection
    public TestimonialService(TestimonialRepository testimonialRepository) {
        this.testimonialRepository = testimonialRepository;
    }

    // Get all testimonials
    public List<Testimonial> getAllTestimonials() {
        return testimonialRepository.findAll();
    }

    // Get testimonial by ID
    public Testimonial getTestimonialById(Long id) {
        Optional<Testimonial> optional = testimonialRepository.findById(id);
        return optional.orElse(null);
    }

    // Save or update testimonial
    public void saveTestimonial(Testimonial testimonial) {
        testimonialRepository.save(testimonial);
    }

    // Delete testimonial
    public void deleteTestimonial(Long id) {
        testimonialRepository.deleteById(id);
    }
}
