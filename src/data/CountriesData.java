package data;

import model.Country;
import java.util.List;
import java.util.ArrayList;

public class CountriesData {
    public static List<Country> getCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("TR", "Turkey"));
        countries.add(new Country("US", "USA"));
        countries.add(new Country("IT", "Italy"));
        countries.add(new Country("FR", "France"));
        countries.add(new Country("DE", "Germany"));
        return countries;
    }
}

