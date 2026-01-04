package org.example;

public class Main {
    public static void main(String[] args) {

        Ride ride = RideFactory.createRide("car");
        System.out.println("Ride Type Selected: " + ride.getType());

        FareStrategy fareStrategy = new PeakFare();

        RideBookingTemplate booking = new CarRideBooking();

        booking.bookRide(10, fareStrategy);
    }
}
