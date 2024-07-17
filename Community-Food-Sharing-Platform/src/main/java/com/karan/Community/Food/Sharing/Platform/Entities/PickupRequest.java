package com.karan.Community.Food.Sharing.Platform.Entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "PickupRequest_Details")
public class PickupRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PickupRequest_ID")
    private String pickupRequestId;

    @Column(name = "FoodItem_ID")
    private String foodItemID;

    @ManyToOne
    @JoinColumn(name = "PickupRequester_ID")
    private User requester;

    @Column(name = "PickupRequest_Date")
    private LocalDate requestDate;

    @Column(name = "PickupRequest_Status")
    private String status;

    public PickupRequest() {
    }

    public PickupRequest(Long id, String pickupRequestId, String foodItemID, User requester, LocalDate requestDate, String status) {
        this.id = id;
        this.pickupRequestId = pickupRequestId;
        this.foodItemID = foodItemID;
        this.requester = requester;
        this.requestDate = requestDate;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPickupRequestId() {
        return pickupRequestId;
    }

    public void setPickupRequestId(String pickupRequestId) {
        this.pickupRequestId = pickupRequestId;
    }

    public String getFoodItemID() {
        return foodItemID;
    }

    public void setFoodItemID(String foodItemID) {
        this.foodItemID = foodItemID;
    }

    public User getRequester() {
        return requester;
    }

    public void setRequester(User requester) {
        this.requester = requester;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
