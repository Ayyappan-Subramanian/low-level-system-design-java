package org.example.parkinglot;

import org.example.entities.Ticket;
import org.example.enums.CustomerType;
import org.example.feecalculation.FeeCalculator;
import org.example.feecalculation.PremiumCustomerFeeCalculator;
import org.example.feecalculation.RegularCustomerFeeCalculator;
import org.example.payment.PaymentMethod;

public class ExitGate {

    public void CompleteExit(Ticket ticket, PaymentMethod paymentMethod, CustomerType customerType, ParkingBuilding building) {

       double parkingFare = 0;

        if(customerType == CustomerType.PREMIUM_CUSTOMER)
        {
            parkingFare = new PremiumCustomerFeeCalculator().CalculateFee(ticket);
        }
        else {
            parkingFare = new RegularCustomerFeeCalculator().CalculateFee(ticket);
        }

        if(paymentMethod.pay(parkingFare));
        {
            if(building.unallocate(ticket));
            {
                System.out.println("Exit process is successful - Gate is opened");
            }
        }

    }
}
