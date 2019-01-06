package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirports = new HashMap<String, Boolean>();
        availableAirports.put("Warsaw", true);
        availableAirports.put("Tokyo", true);
        availableAirports.put("Madrid", true);
        availableAirports.put("Oslo", true);

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if(availableAirports.get(arrivalAirport) != null && availableAirports.get(departureAirport) != null &&
                availableAirports.get(arrivalAirport) && availableAirports.get(departureAirport)) {
            System.out.println("Flight from " + departureAirport + " to " + arrivalAirport + " is possible :)");
        } else {
            throw new RouteNotFoundException("Flight is impossible!");
        }
    }
}
