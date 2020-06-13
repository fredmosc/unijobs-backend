package com.github.unijobs.api.model;


import javax.persistence.*;

@Entity
@Table(name = "services")
public class Service extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String investment;

    public Service() {
    }

    public Service(Long id, String investment) {
        this.id = id;
        this.investment = investment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }
}
