package com.example.cmp.Service;

import com.example.cmp.Model.Service;
import com.example.cmp.Repository.ServiceRepository;

import java.util.List;
import java.util.Optional;

public class ServiceService {

    private final ServiceRepository serviceRepository;

    // Constructor injection
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    // Get all services
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    // Get service by ID
    public Service getServiceById(Long id) {
        Optional<Service> optional = serviceRepository.findById(id);
        return optional.orElse(null);
    }

    // Save or update service
    public void saveService(Service service) {
        serviceRepository.save(service);
    }

    // Delete service by ID
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
