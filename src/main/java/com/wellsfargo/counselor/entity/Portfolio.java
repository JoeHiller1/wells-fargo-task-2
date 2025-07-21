package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String creationDate;



    protected Portfolio() {

    }

    public Portfolio(Client client, String creationDate, Set<Security> security) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() { return portfolioId;}
    public Client getClient() { return client;}
    public void setClient(Client client) { this.client = client;}
    public String getCreationDate() { return creationDate;}
    public void setCreationDate(String creationDate) { this.creationDate = creationDate;}


}
