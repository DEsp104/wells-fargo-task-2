package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id", referencedColumnName = "advisorId")
    private Advisor advisor;

//  Link to Portfolios
    @OneToMany
    @JoinColumn(name = "portfolio_id", referencedColumnName = "portfolioId")
    private Portfolios portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;


    protected Client() {}


    public Client(String name, String email, String address, String phone) {
        this.name = name;
        this.address = email;
        this.phone = address;
        this.email = phone;
    }


    public Long getClientId() {
        return clientId;
    }
    public Advisor getAdvisorId() {
        return advisor;
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

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

}