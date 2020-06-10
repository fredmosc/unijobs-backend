package com.github.unijobs.api.dto;

import com.github.unijobs.api.model.Category;
import com.github.unijobs.api.model.Service;

import java.sql.Timestamp;
import java.util.List;

public class ServiceDTO {

    private String description;
    private String featuredImage;
    private String name;
    private List<Category> categories;

    public ServiceDTO(Service service) {
        this.description = service.getDescription();
        this.featuredImage = service.getFeaturedImage();
        this.name = service.getName();
        this.categories = service.getCategories();
    }
}
