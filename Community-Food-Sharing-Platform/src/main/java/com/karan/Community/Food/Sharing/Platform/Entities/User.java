package com.karan.Community.Food.Sharing.Platform.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserDetails")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "userName")
    private String name;

    @Column(name = "userID")
    private String userID;

    @Column(name = "userPassword")
    private String password;

    @Column(name = "userEmail")
    private String email;

    @Column(name = "userContact")
    private String address;

    public User() {
    }

    public User(Long id, String name, String userID, String password, String email, String address) {
        this.id = id;
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
