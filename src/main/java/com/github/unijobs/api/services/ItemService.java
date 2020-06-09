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
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ServiceRepository serviceRepository, ProductRepository productRepository, ItemRepository itemRepository) {
        this.serviceRepository = serviceRepository;
        this.productRepository = productRepository;
        this.itemRepository = itemRepository;
    }

    public Service save(Service service) {
        return serviceRepository.save(service);
    }

    public List<Item> findAll() {
        return itemRepository.orderedItems();
    }

    public List<Item> latest() {
        // TODO: Return ordered by latest additions
        List<Item> items = new ArrayList<>();

        items.addAll(serviceRepository.findAll());
        items.addAll(productRepository.findAll());

        return items;
    }
}
