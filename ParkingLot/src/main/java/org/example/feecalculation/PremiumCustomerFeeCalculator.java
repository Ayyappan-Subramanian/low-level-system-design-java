package org.example.feecalculation;

import org.example.entities.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class PremiumCustomerFeeCalculator implements FeeCalculator{

    @Override
    public double CalculateFee(Ticket ticket) {

        Duration duration = Duration.between(LocalDateTime.now(), ticket.entryTime).abs();
        int hours = (int) (duration.toMinutes() / 60);
        return hours*10.0;
    }
}
