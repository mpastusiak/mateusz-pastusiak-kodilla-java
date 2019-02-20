package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchFlightsFrom {
    CurrentFlightsMap currentFlights = new CurrentFlightsMap();
    public ArrayList<Flight> flightsMap = currentFlights.getCurrentFlightsList();

    public List<Flight> searchFlightsFrom(Airport airport) {
         return flightsMap.stream()
                .filter(e -> e.getDepartureAirport().getCity().equals(airport.getCity()))
                .collect(Collectors.toList());
    }

    public List<Flight> searchFlightsTo(Airport airport) {
        return flightsMap.stream()
                .filter(e -> e.getArrivalAirport().getCity().equals(airport.getCity()))
                .collect(Collectors.toList());
    }

    public List<Flight> searchConnectingFlights(Airport departureAirport, Airport arrivalAirport) {
        return flightsMap.stream()
                .filter(firstFlight -> flightsMap.stream()
                        .anyMatch(secondFlight ->
                                secondFlight.getArrivalAirport().equals(arrivalAirport.getCity()) &&
                                        firstFlight.getDepartureAirport().equals(departureAirport.getCity())))
                .collect(Collectors.toList());
    }
}
