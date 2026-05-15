package org.example.feecalculation;

import org.example.entities.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class RegularCustomerFeeCalculator implements FeeCalculator{

    @Override
    public double CalculateFee(Ticket ticket) {
        Duration duration = Duration.between(LocalDateTime.now(), ticket.entryTime).abs();
        int hours = (int) ((duration.toMinutes()+59)/60);
        System.out.println(hours);
        return hours*20;
    }
}
