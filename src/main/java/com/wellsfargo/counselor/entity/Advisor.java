package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

//Advisor Class with 6 Attributes(id, firstName, lastName, address, phone, email)
//@Entity is a JPA entity which will map the table named Advisor
@Entity
public class Advisor {

//  auto-generated id
    @Id
    @GeneratedValue()
    private long advisorId;

    // the 'name' attr (client_id) is the name of the column for this Advisor table and is connected to the column
    // displaying the client id (clientId) in the Client table
    @OneToMany
    @JoinColumn(name = "client_id", referencedColumnName = "clientId")
    private Client client;


//  Each instance variable must contain either Column/Relationship
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

//    JPA default constructor (We don't use this one that's why it's protected)
    protected Advisor() {}

//    Constructor (We use this to create instances of Advisor to be saved in database)
    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }
    public Client getClientId() {
        return client;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
