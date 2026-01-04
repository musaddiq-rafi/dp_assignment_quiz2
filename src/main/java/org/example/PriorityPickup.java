package org.example;

class PriorityPickup extends FareDecorator {
    PriorityPickup(FareComponent fare){
        super(fare);
    }

    public double getCost() {
        return wrappedFare.getCost() + 30;
    }
}