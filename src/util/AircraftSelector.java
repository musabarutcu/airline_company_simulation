package util;

import model.Aircraft;
import model.Route;

import java.util.List;
import java.util.ArrayList;

public class AircraftSelector {
    public static List<Aircraft> getSuitableAircraft(List<Aircraft> aircraftList, Route route, int passengerCount) {
        List<Aircraft> suitable = new ArrayList<>();
        for (Aircraft a : aircraftList) {
            if (a.getMaxRangeKm() >= route.getDistanceKm() && a.getMaxPassengers() >= passengerCount) {
                suitable.add(a);
            }
        }
        return suitable;
    }
}
