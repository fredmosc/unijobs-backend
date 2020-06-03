package com.github.unijobs.api.model;

import javax.persistence.*;

@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String icon;

    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getIcon() { return icon; }

    public void setIcon(String icon) { this.icon = icon; }

    public CategoryType getCategoryType() { return categoryType; }

    public void setCategoryType(CategoryType categoryType) { this.categoryType = categoryType; }
}
