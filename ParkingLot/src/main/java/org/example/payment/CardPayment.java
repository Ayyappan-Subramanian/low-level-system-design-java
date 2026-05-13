package org.example.payment;

public class CardPayment implements PaymentMethod{

    public boolean pay(double parkingFare) {
        System.out.println("Paid the parking fare via Card:" + parkingFare);
        return true;
    }
}
