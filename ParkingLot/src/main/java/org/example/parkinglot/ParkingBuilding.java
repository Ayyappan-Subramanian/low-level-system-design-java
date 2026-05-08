package org.example.parkinglot;

import org.example.entities.ParkingSpot;
import org.example.spotmanagers.ParkingSpotManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingBuilding {


    List<ParkingLevel> levels = new ArrayList<>();

    public ParkingBuilding (){

        ParkingSpot spot1 = new ParkingSpot();
        spot1.spotId = "L1-S1";

        ParkingSpot spot2 = new ParkingSpot();
        spot2.spotId = "L1-S2";

        ParkingSpot spot3 = new ParkingSpot();
        spot3.spotId = "L2-S1";

        ParkingSpot spot4 = new ParkingSpot();
        spot4.spotId = "L2-S2";

        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        parkingSpotList.add(spot1);
        parkingSpotList.add(spot2);

        List<ParkingSpot> parkingSpotList2 = new ArrayList<>();
        parkingSpotList2.add(spot3);
        parkingSpotList2.add(spot4);

        ParkingSpotManager m1 = new ParkingSpotManager(parkingSpotList);
        Map<Integer, ParkingSpotManager> map = new HashMap<>();
        map.put(1,m1);

        ParkingSpotManager m2 = new ParkingSpotManager(parkingSpotList2);
        Map<Integer, ParkingSpotManager> map2 = new HashMap<>();
        map2.put(2,m2);

        ParkingLevel levelOneDetails = new ParkingLevel(1,map);
        ParkingLevel levelTwoDetails = new ParkingLevel(2, map2);

        levels.add(levelOneDetails);
        levels.add(levelTwoDetails);
    }

    public void allocate() {
        for(ParkingLevel l : levels)
        {
            //System.out.println("Iam here1");
            if(l.hasAvailabilityForManager(l.levelNumber))
            {
                //System.out.println("Inside if");
                ParkingSpot spot = l.park();
                System.out.println(spot.spotId);
                //return spot;
                break;
            }

        }
        //return null;
    }


}
