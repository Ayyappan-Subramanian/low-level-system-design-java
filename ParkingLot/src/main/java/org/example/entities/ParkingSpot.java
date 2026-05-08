package org.example.entities;

public class ParkingSpot {
    public String spotId;
    public boolean free = true;

    public boolean isSpotFree() {
        return free;
    }

    public void occupySpot() {
        free = false;
    }

    public void releaseSpot() {
        free = true;
    }
}
