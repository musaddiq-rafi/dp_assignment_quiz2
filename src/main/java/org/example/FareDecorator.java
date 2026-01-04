package org.example;

abstract class FareDecorator implements FareComponent {
    protected FareComponent wrappedFare;

    FareDecorator(FareComponent fare){
        this.wrappedFare = fare;
    }
}