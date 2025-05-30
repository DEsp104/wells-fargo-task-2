package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolios {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "clientId")
    private Client client;

    @OneToMany
    @JoinColumn(name = "security_id", referencedColumnName = "securityId")
    private Security security;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;


    protected Portfolios() {}

    public Portfolios(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public Client getClientId() {
        return client;
    }
    public Security getSecurity() {
        return security;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


}

