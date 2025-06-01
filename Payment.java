
package com.mycompany.prblm_2;

// Payment.java
public class Payment {
    private String paymentId;
    private Reservation reservation;
    private double amount;
    private String paymentMethod; // e.g., Cash, Card, Online

    public Payment(String paymentId, Reservation reservation, double amount, String paymentMethod) {
        this.paymentId = paymentId;
        this.reservation = reservation;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentId() {
        return paymentId;
    }
}
