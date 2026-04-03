package com.smartwaste.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String location;
    private String status;

    @Column(name = "bin_status") // ✅ matches DB column
    private String binStatus;

    

    // GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getBinStatus() {
        return binStatus;
    }

    
    public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBinStatus(String binStatus) {
        this.binStatus = binStatus;
    }

    
}