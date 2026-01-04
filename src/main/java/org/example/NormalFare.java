package org.example;

class NormalFare implements FareStrategy {
    public double calculateFare(double distanceKm) {
        return distanceKm * 10;
    }
}
