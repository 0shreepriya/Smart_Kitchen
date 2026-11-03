

package com.smartkitchen.chef;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "chefs")
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialty;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal hourlyRate;

    private String location;

    @Column(nullable = false)
    private boolean verified = false;

    // Required by JPA
    public Chef() {
    }

    // Constructor for creating a chef
    public Chef(String name, String specialty,
                BigDecimal hourlyRate, String location,
                boolean verified) {
        this.name = name;
        this.specialty = specialty;
        this.hourlyRate = hourlyRate;
        this.location = location;
        this.verified = verified;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
