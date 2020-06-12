package com.github.unijobs.api.model;

import com.github.unijobs.api.auth.credentials.model.Credentials;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private String registroAcademico;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Service> services;

    @OneToOne
    private Credentials credentials;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public List<Service> getServices() { return services; }
    public void setServices(List<Service> services) { this.services = services; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }
    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
