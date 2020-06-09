package com.github.unijobs.api.services;

import com.github.unijobs.api.model.Item;
import com.github.unijobs.api.repository.ProductRepository;
import com.github.unijobs.api.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class ItemRepository {

    private final ServiceRepository serviceRepository;
    private final ProductRepository productRepository;

    @Autowired
    public ItemRepository(ServiceRepository serviceRepository, ProductRepository productRepository) {
        this.serviceRepository = serviceRepository;
        this.productRepository = productRepository;
    }

    public List<Item> orderedItems() {
        List<Item> items = new ArrayList<>();

        items.addAll(serviceRepository.findAll());
        items.addAll(productRepository.findAll());

        Collections.sort(items, new Comparator<Item>() {
            public int compare(Item o1, Item o2) {
                return o2.getDataCriacao().compareTo(o1.getDataCriacao());
            }
        });
        return items;
    }
}
