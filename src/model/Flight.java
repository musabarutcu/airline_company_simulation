package model;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Route route;
    private Aircraft assignedAircraft;
    private List<Passenger> passengers;
    private double ticketPrice;

    public Flight(String flightNumber, Route route, Aircraft assignedAircraft, double ticketPrice){
        this.flightNumber = flightNumber;
        this.route = route;
        this.assignedAircraft = assignedAircraft;
        this.ticketPrice = ticketPrice;
        this.passengers = new ArrayList<>();
    }

    public String getFlightNumber(){
        return flightNumber; 
    }
    public Route getRoute(){
        return route; 
    }

    public Aircraft getAssignedAircraft(){
        return assignedAircraft;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }

    public List<Passenger> getPassengers(){ 
        return passengers; 
    }

    public void addPassenger(Passenger p){
        if(passengers.size() < assignedAircraft.getMaxPassengers()){
            passengers.add(p);
        } 
        else{
            System.out.println("Cannot add passenger, aircraft is full.");
        }
    }

    public double calculateRevenue(){
        return passengers.size() * ticketPrice;
    }

    public double calculateCost(double fuelPricePerLiter){
        double fuelCost = route.getDistanceKm() * assignedAircraft.getFuelConsumptionPerKm() * fuelPricePerLiter;
        return fuelCost + assignedAircraft.getFixedCostPerFlight();
    }

    public double calculateProfit(double fuelPricePerLiter){
        return calculateRevenue() - calculateCost(fuelPricePerLiter);
    }

    @Override
    public String toString() {
        return flightNumber + ": " + route + " | Aircraft: " + assignedAircraft.getModel() + " | Passengers: " + passengers.size();
    }
}
