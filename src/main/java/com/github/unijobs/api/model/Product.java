package com.github.unijobs.api.model;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double price;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public Double getPrice() { return price; }

    public void setPrice(Double price) {
        this.price = price;
    }
}
