package com.smartwaste.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bins")
public class Bin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String city;
    private String district;
    private String state;
    private String pickupStatus;

    private String status;

    // ✅ MAP CORRECT COLUMN
    @Column(name = "fill_level")
    private int fillLevel;

    // Getters & Setters

    public Long getId() { return id; }

    public String getLocation() { return location; }

    public String getCity() { return city; }

    public String getDistrict() { return district; }

    public String getState() { return state; }

    public String getStatus() { return status; }
    public String getPickupStatus() {
        return pickupStatus;
    }

    public int getFillLevel() { return fillLevel; }

    public void setId(Long id) { this.id = id; }

    public void setLocation(String location) { this.location = location; }

    public void setCity(String city) { this.city = city; }

    public void setDistrict(String district) { this.district = district; }

    public void setState(String state) { this.state = state; }

    public void setStatus(String status) { this.status = status; }

    public void setFillLevel(int fillLevel) { this.fillLevel = fillLevel; }


    public void setPickupStatus(String pickupStatus) {
        this.pickupStatus = pickupStatus;
    }
}