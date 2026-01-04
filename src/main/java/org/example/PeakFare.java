package org.example;

class PeakFare implements FareStrategy {
    public double calculateFare(double distanceKm) {
        return distanceKm * 15;
    }
}
