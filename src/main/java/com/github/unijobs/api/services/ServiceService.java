package com.github.unijobs.api.services;

import com.github.unijobs.api.dto.ServiceDTO;
import com.github.unijobs.api.model.Service;
import com.github.unijobs.api.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    public Optional<Service> saveDTO(ServiceDTO serviceDTO) {

        Optional<Service> service = this.findOne(serviceDTO.getId());

        service.ifPresent(value -> value.setInvestment(serviceDTO.getInvestment()));

        return service;
    }

    public Optional<Service> findOne(Long id) {
        return serviceRepository.findById(id);
    }

    public Service save(Service service) {
        serviceRepository.save(service);

        return service;
    }
}
