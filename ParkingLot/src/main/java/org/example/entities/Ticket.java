package org.example.entities;

import org.example.parkinglot.ParkingLevel;

import java.time.LocalDateTime;

public class Ticket {

    public ParkingSpot spot;
    Vehicle vehicleNumber;
    public ParkingLevel level;
    public LocalDateTime entryTime;

    public Ticket (ParkingSpot spot, ParkingLevel level) {
        this.spot = spot;
       // this.vehicleNumber = vehicleNumber;
        this.level = level;
        this.entryTime = LocalDateTime.now();
    }
}
