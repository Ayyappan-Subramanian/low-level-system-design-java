package org.example.parkinglot;

import org.example.entities.Ticket;
import org.example.entities.Vehicle;

import java.util.Map;

public class EntryGate {

    public ParkingBuilding parkingBuilding;

    public EntryGate(ParkingBuilding parkingBuilding) {
        this.parkingBuilding = parkingBuilding;
    }

    public Ticket admitVehicle(Vehicle vehicle) {
            return parkingBuilding.allocate(vehicle);
    }
}
