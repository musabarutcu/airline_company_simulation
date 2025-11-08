package data;

import model.City;
import model.Country;
import java.util.List;
import java.util.ArrayList;

public class CitiesData {
    public static List<City> getCities(List<Country> countries) {
        List<City> cities = new ArrayList<>();

        Country tr = countries.stream().filter(c -> c.getCode().equals("TR")).findFirst().get();
        Country us = countries.stream().filter(c -> c.getCode().equals("US")).findFirst().get();
        Country it = countries.stream().filter(c -> c.getCode().equals("IT")).findFirst().get();
        Country fr = countries.stream().filter(c -> c.getCode().equals("FR")).findFirst().get();
        Country de = countries.stream().filter(c -> c.getCode().equals("DE")).findFirst().get();

        // Türkiye
        cities.add(new City("Antalya", tr));
        cities.add(new City("İzmir", tr));
        cities.add(new City("İstanbul", tr));
        cities.add(new City("Konya", tr));

        // ABD
        cities.add(new City("New York", us));
        cities.add(new City("Los Angeles", us));

        // İtalya
        cities.add(new City("Roma", it));
        cities.add(new City("Napoli", it));

        // Fransa
        cities.add(new City("Paris", fr));
        cities.add(new City("Lyon", fr));

        // Almanya
        cities.add(new City("Berlin", de));
        cities.add(new City("Hamburg", de));

        return cities;
    }
}

