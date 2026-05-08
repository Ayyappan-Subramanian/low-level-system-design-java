package org.example.parkinglot;

import org.example.ParkingLotClient;
import org.example.entities.ParkingSpot;
import org.example.entities.Vehicle;
import org.example.enums.VehicleType;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.HashMap;
import java.util.Map;

public class ParkingLevel {

    int levelNumber;
    Map<Integer, ParkingSpotManager> managers = new HashMap<>();

    public ParkingLevel(int levelNumber, Map<Integer, ParkingSpotManager> managers){
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailabilityForManager(int l) {
        //System.out.println("Availability For managers");
        //System.out.println(managers.get(l));
        //System.out.println(managers.get(l).hasFreeSpot());
        return managers.get(l).hasFreeSpot();
    }

    public ParkingSpot park() {
        ParkingSpotManager manager = managers.get(levelNumber);
        //System.out.println(manager);
        ParkingSpot spot = manager.park();
        return spot;
    }

    public void unPark(ParkingSpot spot) {
        ParkingSpotManager manager = managers.get(levelNumber);
        manager.unPark(spot);
    }
}
