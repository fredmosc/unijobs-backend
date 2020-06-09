package com.github.unijobs.api.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@MappedSuperclass
public class Item {

    private String description;

    private String featuredImage;

    private String name;

    @OneToMany
    private List<Category> categories;

    private Date dataCriacao;

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
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
