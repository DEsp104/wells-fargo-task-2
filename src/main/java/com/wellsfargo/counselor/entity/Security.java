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
    private String purchase_price;

    @Column(nullable = false)
    private String quantity;


    protected Security() {}

    public Security(String name, String category, String purchaseDate, String purchasePrice, String quantity) {
        this.name = name;
        this.category = category;
        this.purchase_date = purchaseDate;
        this.purchase_price = purchasePrice;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }
    public Portfolios getPortfolioId() {
        return portfolio;
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

    public String getPurchasePrice() {
        return purchase_price;
    }
    public void setPurchasePrice(String purchasePrice) {
        this.purchase_price = purchasePrice;
    }

    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}



