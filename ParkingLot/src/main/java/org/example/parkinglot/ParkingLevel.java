package org.example.parkinglot;

import org.example.ParkingLotClient;
import org.example.entities.ParkingSpot;
import org.example.entities.Vehicle;
import org.example.enums.VehicleType;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLevel {

    public int levelNumber;
    //ParkingSpotManager managers;
    Map<VehicleType, ParkingSpotManager> managers = new HashMap<>();

    public ParkingLevel(int levelNumber, Map<VehicleType, ParkingSpotManager> managers){
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailabilityForManager(VehicleType type) {
        //System.out.println("Availability For managers");
        //System.out.println(managers.get(l));
        //System.out.println(managers.get(l).hasFreeSpot());
        if(managers.get(type) == null)
            return false;
        else
            return managers.get(type).hasFreeSpot();
    }

    public ParkingSpot park(VehicleType type) {
        ParkingSpotManager manager = managers.get(type);
        //System.out.println(manager);
        ParkingSpot spot = manager.park();
        return spot;
    }
//
//    public void unPark(ParkingSpot spot) {
//        ParkingSpotManager manager = managers.get(VehicleType);
//        manager.unPark(spot);
//    }
}
