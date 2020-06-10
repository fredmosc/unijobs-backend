package com.github.unijobs.api.controller;

import com.github.unijobs.api.model.Item;
import com.github.unijobs.api.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

//    @PostMapping
//    public ResponseEntity<Service> save(@RequestBody Service service){
//        return ResponseEntity.ok(itemService.save(service));
//    }

    @GetMapping
    public ResponseEntity<List<Item>> list(){
        return ResponseEntity.ok(itemService.findAll());
    }
}
