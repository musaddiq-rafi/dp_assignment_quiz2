package org.example;

class InsuranceAddon extends FareDecorator {
    InsuranceAddon(FareComponent fare){
        super(fare);
    }

    public double getCost() {
        return wrappedFare.getCost() + 20;
    }
}