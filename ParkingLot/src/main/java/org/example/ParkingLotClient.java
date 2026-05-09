package org.example;

import org.example.entities.ParkingSpot;
import org.example.entities.Ticket;
import org.example.entities.Vehicle;
import org.example.enums.VehicleType;
import org.example.parkinglot.ParkingBuilding;
import org.example.parkinglot.ParkingLevel;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("TN22-AD 0452", VehicleType.TWO_WHEELER);
        Vehicle v2 = new Vehicle("TN22-BC 1234", VehicleType.FOUR_WHEELER);

        ParkingBuilding building1 = new ParkingBuilding();
        Ticket t = building1.allocate(v2);
        Ticket t2 = building1.allocate(v1);

        System.out.println("Please Find the Ticket Information Below:");
        System.out.println(t.spotId.spotId);
        System.out.println(t.level.levelNumber);
        System.out.println(t.entryTime);




    }
}