package org.example.spotmanagers;

import org.example.entities.ParkingSpot;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> spotList = new ArrayList<>();

    public ParkingSpotManager(List<ParkingSpot> spotList) {
        this.spotList = spotList;
    }

    public ParkingSpot park() {
        for(ParkingSpot spot : spotList )
        {
            //System.out.println("Iam at the spot");
            if(spot.isSpotFree())
            {
                spot.occupySpot();
                return spot;
                //System.out.println("Spot allocated at:" + spot.spotId);
            }
        }
        return null;
    }

    public void unPark(ParkingSpot spot) {
        spot.releaseSpot();
    }

    public boolean hasFreeSpot() {
        for(ParkingSpot spot : spotList)
        {
            //System.out.println("Inside hasfreespot");
            if(spot.isSpotFree())
                return true;
        }
        return false;

    }




}
