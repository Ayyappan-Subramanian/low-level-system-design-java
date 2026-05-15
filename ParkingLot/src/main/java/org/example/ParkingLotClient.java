package org.example;

import org.example.entities.ParkingSpot;
import org.example.entities.Ticket;
import org.example.entities.Vehicle;
import org.example.enums.CustomerType;
import org.example.enums.VehicleType;
import org.example.parkinglot.*;
import org.example.payment.CardPayment;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static void main(String[] args) {

        ParkingBuilding building = ParkingLotFactory.createBuilding();
        EntryGate entryGate = new EntryGate(building);

        Vehicle v1 = new Vehicle("TN22-AD 0452", VehicleType.FOUR_WHEELER);
        Vehicle v2 = new Vehicle("TN22-BC 1234", VehicleType.FOUR_WHEELER);
        Vehicle v3 = new Vehicle("TN22-BC 5648", VehicleType.FOUR_WHEELER);

        Ticket ticket1 = entryGate.admitVehicle(v1);
        Ticket ticket2 = entryGate.admitVehicle(v2);

        try{
            Ticket ticket3 = entryGate.admitVehicle(v3);
            ExitGate exit2 = new ExitGate(building);
            exit2.CompleteExit(ticket3, new CardPayment(), CustomerType.REGULAR_CUSTOMER);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Please Find the Ticket Information Below:");
        System.out.println(ticket2.spot.spotId);
        System.out.println(ticket2.level.levelNumber);
        System.out.println(ticket2.entryTime);

        ExitGate exit1 = new ExitGate(building);
        exit1.CompleteExit(ticket2, new CardPayment(), CustomerType.REGULAR_CUSTOMER);

//        System.out.println("Please Find the Ticket Information Below:");
//        System.out.println(ticket3.spot.spotId);
//        System.out.println(ticket3.level.levelNumber);
//        System.out.println(ticket3.entryTime);



    }
}