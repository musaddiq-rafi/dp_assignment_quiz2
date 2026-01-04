package org.example;

class PromoFare implements FareStrategy {
    public double calculateFare(double distanceKm) {
        return distanceKm * 8;
    }
}
