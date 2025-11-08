package model;

public class Airport {
    private String iataCode;
    private String name;
    private City city;
    private double latitude;
    private double longitude;


    public Airport(String iataCode, String name, City city, double latitude, double longitude){
        this.iataCode = iataCode;
        this.name = name;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getIataCode(){
        return iataCode;
    }

    public String getName(){
        return name; 
    }
    
    public City getCity(){
        return city; 
    
    }

    public double getLatitude(){ 
        return latitude;
    }
    
    public double getLongitude(){ 
        return longitude; 
    }


    @Override
    public String toString(){
    return name + " (" + iataCode + "), " + city;
    }
}