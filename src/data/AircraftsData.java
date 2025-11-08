package data;

import model.Aircraft;
import java.util.List;
import java.util.ArrayList;

public class AircraftsData {
    public static List<Aircraft> getAircraftList() {
        List<Aircraft> list = new ArrayList<>();
        list.add(new Aircraft("Boeing 737", 180, 5600, 2.5, 1000));
        list.add(new Aircraft("Airbus A320", 150, 5500, 2.3, 900));
        list.add(new Aircraft("Embraer 195", 120, 2500, 1.8, 700));
        list.add(new Aircraft("Boeing 777", 300, 9700, 5.5, 3000));
        list.add(new Aircraft("Airbus A350", 280, 9000, 5.0, 2800));
        return list;
    }
}

