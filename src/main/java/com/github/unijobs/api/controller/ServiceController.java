package com.github.unijobs.api.controller;

import com.github.unijobs.api.model.Service;
import com.github.unijobs.api.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final ItemService serviceService;



    @Autowired
    public ServiceController(ItemService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping
    public ResponseEntity<Service> save(@RequestBody Service product){
        return ResponseEntity.ok(serviceService.save(product));
    }

    // FIXME: incompatible types
//    @GetMapping
//    public ResponseEntity<List<Service>> list(){
//        return ResponseEntity.ok(serviceService.findAll());
//    }

}
