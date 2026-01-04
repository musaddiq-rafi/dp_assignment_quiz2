package org.example;

class CarRideBooking extends RideBookingTemplate {

    protected void matchDriver() {
        System.out.println("Matching a car driver nearby...");
    }

    protected double applyAddOns(double baseCost) {

        FareComponent fare = new BaseFare(baseCost);

        fare = new PriorityPickup(fare);
        fare = new InsuranceAddon(fare);

        return fare.getCost();
    }
}

