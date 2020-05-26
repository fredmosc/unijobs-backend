package com.github.unijobs.api.controller;

import com.github.unijobs.api.model.Product;
import com.github.unijobs.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> list(){
        return ResponseEntity.ok(productService.findAll());
    }

}
