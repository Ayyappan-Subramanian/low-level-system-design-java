package org.example.parkinglot;

import org.example.entities.ParkingSpot;
import org.example.entities.Ticket;
import org.example.entities.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingBuilding {


    List<ParkingLevel> levels = new ArrayList<>();

    public ParkingBuilding (List<ParkingLevel> levels){
        this.levels = levels;
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
                //System.out.println(spot.spotId);
                return ticket;
                //break;
            }

        }
        return null;
    }

    public boolean unallocate(Ticket ticket) {
        ticket.spot.releaseSpot();
        if(ticket.spot.free)
            return true;
        else
            return false;
    }
}
