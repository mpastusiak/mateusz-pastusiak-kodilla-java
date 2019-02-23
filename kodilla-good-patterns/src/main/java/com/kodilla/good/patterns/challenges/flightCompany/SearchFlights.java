package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SearchFlights {
    final CurrentFlightsList currentFlights = new CurrentFlightsList();
    private final ArrayList<Flight> flightsMap = currentFlights.getCurrentFlightsList();

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

    public List<ConnectingFlight> searchConnectingFlights(Airport departureAirport, Airport arrivalAirport) {
        return flightsMap.stream()
                .filter(airport1 -> airport1.getDepartureAirport().equals(departureAirport))
                .flatMap(airport1 -> flightsMap.stream()
                        .filter(airport2 -> airport2.getDepartureAirport().equals(airport1.getArrivalAirport()))
                        .filter(airport2 -> airport2.getArrivalAirport().equals(arrivalAirport))
                        .map(airport2 -> new ConnectingFlight(airport1, airport2)))
                .collect(Collectors.toList());
    }
}