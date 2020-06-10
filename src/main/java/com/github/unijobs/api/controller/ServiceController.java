package com.github.unijobs.api.controller;

import com.github.unijobs.api.dto.ServiceDTO;
import com.github.unijobs.api.model.Service;
import com.github.unijobs.api.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping
    public ResponseEntity<Service> save(@RequestBody Service service) {
        return ResponseEntity.ok(serviceService.save(service));
    }

    @GetMapping
    public ResponseEntity<List<Service>> list() {
        return ResponseEntity.ok(serviceService.findAll());
    }

    @GetMapping("{id}")
    public Optional<Service> findOne(@PathVariable Long id) {
        return serviceService.findOne(id);
    }

    @PatchMapping("{id}")
    // https://stackoverflow.com/a/33467045
    public ResponseEntity<Service> update(@RequestBody ServiceDTO serviceDTO) {
        return new ResponseEntity<>(serviceService.saveDTO(serviceDTO), HttpStatus.OK);

    }
}
