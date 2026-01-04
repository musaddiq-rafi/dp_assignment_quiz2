package org.example;


class RideFactory {
    public static Ride createRide(String rideType){
        return switch (rideType.toLowerCase()) {
            case "bike" -> new BikeRide();
            case "car" -> new CarRide();
            case "premium" -> new PremiumRide();
            default -> throw new IllegalArgumentException("Invalid Ride Type");
        };
    }
}
