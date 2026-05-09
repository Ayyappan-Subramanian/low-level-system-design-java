package org.example.parkinglot;

import org.example.entities.ParkingSpot;
import org.example.entities.Ticket;
import org.example.entities.Vehicle;
import org.example.enums.VehicleType;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingBuilding {


    List<ParkingLevel> levels = new ArrayList<>();

    public ParkingBuilding (){

        ParkingSpot spot1 = new ParkingSpot();
        spot1.spotId = "L1-S1TW";

        ParkingSpot spot2 = new ParkingSpot();
        spot2.spotId = "L1-S2TW";

        ParkingSpot spot3 = new ParkingSpot();
        spot3.spotId = "L2-S1FW";

        ParkingSpot spot4 = new ParkingSpot();
        spot4.spotId = "L2-S2FW";

        ParkingSpot spot5 = new ParkingSpot();
        spot5.spotId = "L2-S3TW";

        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        parkingSpotList.add(spot1);
        parkingSpotList.add(spot2);

        List<ParkingSpot> parkingSpotList2 = new ArrayList<>();
        parkingSpotList2.add(spot3);
        parkingSpotList2.add(spot4);

        List<ParkingSpot> parkingSpotList3 = new ArrayList<>();
        parkingSpotList2.add(spot5);

        ParkingSpotManager m1 = new ParkingSpotManager(parkingSpotList);

        Map<VehicleType, ParkingSpotManager> map1 = new HashMap<>();
        map1.put(VehicleType.TWO_WHEELER,m1);

        ParkingSpotManager m2 = new ParkingSpotManager(parkingSpotList2);

        ParkingSpotManager m3 = new ParkingSpotManager(parkingSpotList3);

        Map<VehicleType, ParkingSpotManager> map2 = new HashMap<>();
        map2.put(VehicleType.FOUR_WHEELER,m2);
        map2.put(VehicleType.TWO_WHEELER, m3);

        ParkingLevel levelOneDetails = new ParkingLevel(1,map1);
        ParkingLevel levelTwoDetails = new ParkingLevel(2, map2);

        levels.add(levelOneDetails);
        levels.add(levelTwoDetails);
    }

    public Ticket allocate(Vehicle vehicle) {
        for(ParkingLevel l : levels)
        {
            //System.out.println("Iam here1");
            if(l.hasAvailabilityForManager(vehicle.vehicleType))
            {
                //System.out.println("Inside if");
                ParkingSpot spot = l.park(vehicle.vehicleType);
                Ticket ticket = new Ticket(spot, l);
                System.out.println(spot.spotId);
                return ticket;
                //break;
            }

        }
        return null;
    }


}
