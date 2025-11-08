package util;

import model.Airport;

public class DistanceCalculator {
    public static double calculateDistanceKm(Airport a, Airport b){
        double lat1 = Math.toRadians(a.getLatitude());
        double lon1 = Math.toRadians(a.getLongitude());
        double lat2 = Math.toRadians(b.getLatitude());
        double lon2 = Math.toRadians(b.getLongitude());

        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        double haversine = Math.pow(Math.sin(dlat / 2), 2)
                         + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);

        double earthRadius = 6371; // km
        double distance = 2 * earthRadius * Math.asin(Math.sqrt(haversine));

        return distance;
    }
}

