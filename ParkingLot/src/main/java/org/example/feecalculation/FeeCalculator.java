package org.example.feecalculation;

import org.example.entities.Ticket;

public interface FeeCalculator {

    public double CalculateFee(Ticket ticket);
}
