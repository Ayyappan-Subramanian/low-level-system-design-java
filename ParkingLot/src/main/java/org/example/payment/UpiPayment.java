package org.example.payment;

public class UpiPayment implements PaymentMethod {

    public boolean pay(double parkingFare){
        System.out.println("Paid the parking fare:" + parkingFare);
        return true;

    }
}
