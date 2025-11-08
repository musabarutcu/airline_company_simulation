package model;

public class Aircraft {
    private String model;
    private int maxPassengers;
    private double maxRangeKm;
    private double fuelConsumptionPerKm;
    private double fixedCostPerFlight;

    public Aircraft(String model, int maxPassengers, double maxRangeKm, double fuelConsumptionPerKm, double fixedCostPerFlight){
        this.model = model;
        this.maxPassengers = maxPassengers;
        this.maxRangeKm = maxRangeKm;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.fixedCostPerFlight = fixedCostPerFlight;
    }

    public String getModel(){
        return model; 
    }

    public int getMaxPassengers(){
        return maxPassengers;
    }
    public double getMaxRangeKm(){
        return maxRangeKm;
    }

    public double getFuelConsumptionPerKm(){
        return fuelConsumptionPerKm;
    }

    public double getFixedCostPerFlight(){
        return fixedCostPerFlight;
    }

    @Override
    public String toString(){
        return model + " | MaxPassengers: " + maxPassengers + " | Range: " + maxRangeKm + " km";
    }
}

