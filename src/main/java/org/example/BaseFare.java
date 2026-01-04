package org.example;

class BaseFare implements FareComponent {
    protected double cost;

    BaseFare(double cost){
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}