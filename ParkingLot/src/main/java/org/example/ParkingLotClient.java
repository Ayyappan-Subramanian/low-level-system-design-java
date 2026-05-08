package org.example;

import org.example.entities.ParkingSpot;
import org.example.parkinglot.ParkingBuilding;
import org.example.parkinglot.ParkingLevel;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static void main(String[] args) {

        ParkingBuilding building1 = new ParkingBuilding();
        building1.allocate();
        building1.allocate();


    }
}