package org.example;

class StudentFare implements FareStrategy {
    public double calculateFare(double distanceKm) {
        return distanceKm * 7.5;
    }
}
