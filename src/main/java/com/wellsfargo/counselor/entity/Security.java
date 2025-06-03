package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolioId")
    private Portfolios portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchase_date;

    @Column(nullable = false)
    private float purchase_price;

    @Column(nullable = false)
    private float quantity;


    protected Security() {}

    public Security(Portfolios portfolio, String name, String category, String purchaseDate, float purchasePrice, float quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchase_date = purchaseDate;
        this.purchase_price = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Portfolios getPortfolio() {
        return portfolio;
    }
    public void setPortfolio(Portfolios portfolio) {
        this.portfolio = portfolio;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getPurchaseDate() {
        return purchase_date;
    }
    public void setPurchaseDate(String purchaseDate) {
        this.purchase_date = purchaseDate;
    }

    public float getPurchasePrice() {
        return purchase_price;
    }
    public void setPurchasePrice(float purchasePrice) {
        this.purchase_price = purchasePrice;
    }

    public float getQuantity() {
        return quantity;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

}



