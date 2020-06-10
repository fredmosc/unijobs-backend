package com.github.unijobs.api.model;


import com.github.unijobs.api.dto.ServiceDTO;

import javax.persistence.*;

@Entity
@Table(name="services")
public class Service extends Item {

    public Service() { }

    public Service(Long id, String investment) {
        this.id = id;
        this.investment = investment;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String investment;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getInvestment() { return investment; }

    public void setInvestment(String investment) { this.investment = investment; }
}
