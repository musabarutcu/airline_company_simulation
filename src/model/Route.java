package model;

import util.DistanceCalculator;

public class Route {
    private Airport origin;
    private Airport destination;
    private double distanceKm;

    public Route(Airport origin, Airport destination){
        this.origin = origin;
        this.destination = destination;
        this.distanceKm = DistanceCalculator.calculateDistanceKm(origin, destination);
    }

    public Airport getOrigin(){ 
        return origin;
    }

    public Airport getDestination(){
        return destination;
    }

    public double getDistanceKm(){
        return distanceKm;
    }

    @Override
    public String toString(){
        return origin.getIataCode() + " -> " + destination.getIataCode() + " | Distance: " + String.format("%.2f", distanceKm) + " km";
    }
}

