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

    public Portfolios(Client client, String name, String type) {
        this.client = client;
        this.name = name;
        this.type = type;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public Security getSecurity() {
        return security;
    }

    public Client getClient() {
        return client;
    }
    public void seClient(Client client) {
        this.client = client;
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

