package org.example;

abstract class RideBookingTemplate {

    public final void bookRide(double distanceKm, FareStrategy strategy) {
        matchDriver();
        confirmRide();
        double baseCost = strategy.calculateFare(distanceKm);
        double finalCost = applyAddOns(baseCost);
        chargeCustomer(finalCost);
        sendReceipt();
    }

    protected abstract void matchDriver();
    protected abstract double applyAddOns(double baseCost);

    protected void confirmRide(){
        System.out.println("Ride confirmed!");
    }

    protected void chargeCustomer(double amount){
        System.out.println("Charging customer: " + amount + " BDT");
    }

    protected void sendReceipt(){
        System.out.println("Receipt sent to user.");
    }
}
