package com.karan.Community.Food.Sharing.Platform.DTO;

import java.time.LocalDate;

public class PickupRequestDto {
    private String pickupRequestId;
    private String foodItemID;
    private Long userId;
    private LocalDate requestDate;
    private String status;

    // Getters and Setters
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
