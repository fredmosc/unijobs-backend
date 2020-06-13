package com.github.unijobs.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="products")
public class Product extends Item{
    private Double price;

    public Double getPrice() { return price; }

    public void setPrice(Double price) {
        this.price = price;
    }
}
