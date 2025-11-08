package main;

import data.*;
import model.*;
import util.*;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Verileri al
        List<Country> countries = CountriesData.getCountries();
        List<City> cities = CitiesData.getCities(countries);
        List<Airport> airports = AirportsData.getAirports(cities);
        List<Aircraft> aircrafts = AircraftsData.getAircraftList();

        // 2️⃣ Mevcut rotaları oluştur
        List<Route> routes = new ArrayList<>();
        for (int i = 0; i < airports.size(); i++) {
            for (int j = 0; j < airports.size(); j++) {
                if (i != j) {
                    routes.add(new Route(airports.get(i), airports.get(j)));
                }
            }
        }

        // 3️⃣ Rotaları kullanıcıya göster
        System.out.println("Mevcut rotalar:");
        for (int i = 0; i < routes.size(); i++) {
            System.out.println(i + ": " + routes.get(i));
        }

        System.out.print("Rotayı seçin (0-" + (routes.size() - 1) + "): ");
        int routeIndex = Integer.parseInt(sc.nextLine());
        Route selectedRoute = routes.get(routeIndex);

        // 4️⃣ Yolcu sayısını al
        System.out.print("Kaç yolcu eklemek istiyorsunuz? ");
        int numPassengers = Integer.parseInt(sc.nextLine());

        // 5️⃣ Uygun uçakları bul
        List<Aircraft> suitableAircraft = AircraftSelector.getSuitableAircraft(aircrafts, selectedRoute, numPassengers);
        if (suitableAircraft.isEmpty()) {
            System.out.println("Uygun uçak bulunamadı!");
            sc.close();
            return;
        }

        System.out.println("Uygun uçaklar:");
        for (int i = 0; i < suitableAircraft.size(); i++) {
            System.out.println(i + ": " + suitableAircraft.get(i));
        }

        System.out.print("Uçak seçin (0-" + (suitableAircraft.size() - 1) + "): ");
        int aircraftIndex = Integer.parseInt(sc.nextLine());
        Aircraft selectedAircraft = suitableAircraft.get(aircraftIndex);

        // 6️⃣ Uçuş oluştur
        Flight flight = new Flight("FL001", selectedRoute, selectedAircraft, 150);

        // 7️⃣ Yolcuları ekle ve rezervasyon oluştur
        for (int i = 0; i < numPassengers; i++) {
            System.out.print("Yolcu adı: ");
            String name = sc.nextLine();
            System.out.print("Yolcu yaşı: ");
            int age = Integer.parseInt(sc.nextLine());

            Passenger passenger = new Passenger("P" + (i + 1), name, age);
            flight.addPassenger(passenger);
            Reservation reservation = new Reservation("R" + (i + 1), flight, passenger, null);
            System.out.println("Reservation created: " + reservation);
        }

        // 8️⃣ Sonuçları göster
        System.out.println("==== Flight Summary ====");
        System.out.println(flight);

        double fuelPrice = 1.2; // örnek yakıt fiyatı
        System.out.println("Revenue: " + flight.calculateRevenue());
        System.out.println("Cost: " + flight.calculateCost(fuelPrice));
        System.out.println("Profit: " + flight.calculateProfit(fuelPrice));

        sc.close();
    }
}
