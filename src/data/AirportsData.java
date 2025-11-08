package data;

import model.Airport;
import model.City;
import java.util.List;
import java.util.ArrayList;

public class AirportsData {
    public static List<Airport> getAirports(List<City> cities) {
        List<Airport> airports = new ArrayList<>();

        for (City city : cities) {
            switch(city.getName()) {
                case "Antalya":
                    airports.add(new Airport("AYT", "Antalya Airport", city, 36.900, 30.800));
                    break;
                case "İzmir":
                    airports.add(new Airport("ADB", "Adnan Menderes Airport", city, 38.320, 27.155));
                    break;
                case "İstanbul":
                    airports.add(new Airport("IST", "Istanbul Airport", city, 41.2753, 28.7519));
                    break;
                case "Konya":
                    airports.add(new Airport("KYA", "Konya Airport", city, 37.979, 32.562));
                    break;
                case "New York":
                    airports.add(new Airport("JFK", "John F. Kennedy Airport", city, 40.6413, -73.7781));
                    break;
                case "Los Angeles":
                    airports.add(new Airport("LAX", "Los Angeles Airport", city, 33.9416, -118.4085));
                    break;
                case "Roma":
                    airports.add(new Airport("FCO", "Fiumicino Airport", city, 41.8003, 12.2389));
                    break;
                case "Napoli":
                    airports.add(new Airport("NAP", "Napoli Airport", city, 40.886, 14.290));
                    break;
                case "Paris":
                    airports.add(new Airport("CDG", "Charles de Gaulle", city, 49.0097, 2.5479));
                    break;
                case "Lyon":
                    airports.add(new Airport("LYS", "Lyon–Saint-Exupéry Airport", city, 45.7256, 5.0811));
                    break;
                case "Berlin":
                    airports.add(new Airport("BER", "Berlin Brandenburg Airport", city, 52.3667, 13.5033));
                    break;
                case "Hamburg":
                    airports.add(new Airport("HAM", "Hamburg Airport", city, 53.633, 9.988));
                    break;
            }
        }

        return airports;
    }
}
