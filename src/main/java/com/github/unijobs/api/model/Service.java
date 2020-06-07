package com.github.unijobs.api.model;

import javax.persistence.*;

@Entity
@Table(name="services")
public class Service extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String investment;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getInvestment() { return investment; }

    public void setInvestment(String investment) { this.investment = investment; }
}
