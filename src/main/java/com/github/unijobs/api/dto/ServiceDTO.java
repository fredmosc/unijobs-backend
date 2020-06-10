package com.github.unijobs.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.unijobs.api.model.Category;
import com.github.unijobs.api.model.Service;

import java.sql.Timestamp;
import java.util.List;

public class ServiceDTO {

    private Long id;
    private String description;
    private String featuredImage;
    private String name;

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @JsonIgnore
    private Timestamp createdAt;

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    private String investment;
    private List<Category> categories;

    public ServiceDTO(){}

    public ServiceDTO(Service service) {
        this.description = service.getDescription();
        this.featuredImage = service.getFeaturedImage();
        this.name = service.getName();
        this.categories = service.getCategories();
        this.createdAt = service.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
