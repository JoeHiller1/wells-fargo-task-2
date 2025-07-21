package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.util.Set;
@Entity
public class Security {
    @Id
    @GeneratedValue
    private Long securityId;

    @ManyToOne(targetEntity = Portfolio.class)
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {}

    public Security(Portfolio portfolio, String name, String category, long purchasePrice, String purchaseDate, long quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return  securityId; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public long getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(long purchasePrice) { this.purchasePrice = purchasePrice; }
    public String getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
    public long getQuantity() { return quantity; }
    public void setQuantity(long quantity) { this.quantity = quantity; }
}
