package com.wellsfargo.counselor.entity;
import java.util.Set;
import jakarta.persistence.*;
import jdk.jfr.Relational;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;



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

    @ManyToOne(targetEntity = Advisor.class)
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;


    @OneToMany(targetEntity = Portfolio.class)
    @JoinColumn(name = "portfolioId", nullable = false)
    private Set<Portfolio> portfolios;

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email, Advisor advisor, Set<Portfolio> portfolios) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
        this.portfolios = portfolios;
    }


    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) { this.advisor = advisor;}

    public Set<Portfolio> getPortfolios() { return portfolios; }

    public void setPortfolios(Set<Portfolio> portfolios) { this.portfolios = portfolios;}

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

    public long getClientId() { return clientId;}
}
