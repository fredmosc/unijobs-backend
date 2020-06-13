package com.github.unijobs.api.model;


import javax.persistence.*;

@Entity
@Table(name = "services")
public class Service extends Item {

    private String investment;

    public Service() {
    }

    public Service(Long id, String investment) {
        super.setId(id);
        this.investment = investment;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }
}
