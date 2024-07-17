package com.karan.Community.Food.Sharing.Platform.Entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="FoodItemDetails")
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="description")
    private String description;
    @Column(name="quantity")
    private int quantity;
    @Column(name="expiryDate")
    private LocalDate expirationDate;
    @Column(name="Location")
    private String location;
    @Column(name="Status") 
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors, Getters, and Setters
    public FoodItem() {
    }

    public FoodItem(Long id, String description, int quantity, LocalDate expirationDate, String location, String status, User user) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.location = location;
        this.status = status;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
