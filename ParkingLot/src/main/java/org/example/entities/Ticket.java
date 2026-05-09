package org.example.entities;

import org.example.parkinglot.ParkingLevel;

import java.time.LocalDateTime;

public class Ticket {

    public ParkingSpot spotId;
    Vehicle vehicleNumber;
    public ParkingLevel level;
    public LocalDateTime entryTime;

    public Ticket (ParkingSpot spotId, ParkingLevel level) {
        this.spotId = spotId;
       // this.vehicleNumber = vehicleNumber;
        this.level = level;
        this.entryTime = LocalDateTime.now();
    }
}
