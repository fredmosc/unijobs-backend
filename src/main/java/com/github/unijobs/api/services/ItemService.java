package com.github.unijobs.api.services;

import com.github.unijobs.api.model.Item;
import com.github.unijobs.api.model.Service;
import com.github.unijobs.api.repository.ProductRepository;
import com.github.unijobs.api.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ItemService {
    private final ServiceRepository serviceRepository;
    private final ProductRepository productRepository;

    @Autowired
    public ItemService(ServiceRepository serviceRepository, ProductRepository productRepository) {
        this.serviceRepository = serviceRepository;
        this.productRepository = productRepository;
    }

    public Service save(Service service){
        return serviceRepository.save(service);
    }

    public List<Item> findAll(){
        // TODO: Extract to own repository;
        List<Item> items = new ArrayList<>();

        items.addAll(serviceRepository.findAll());
        items.addAll(productRepository.findAll());

        return items;
    }

    public List<Item> latest() {
        // TODO: Return ordered by latest aditions
        List<Item> items = new ArrayList<>();

        items.addAll(serviceRepository.findAll());
        items.addAll(productRepository.findAll());

        return items;
    }
}
