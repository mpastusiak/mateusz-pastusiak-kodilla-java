package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;

public class CurrentFlightsMap {
    private final ArrayList<Flight> currentFlightsList = new ArrayList<>();

    public void setCurrentFlightsList() {
        CurrentAirportsMap currentAirports = new CurrentAirportsMap();
        ArrayList<Airport> airportsMap = currentAirports.getCurrentAirportsList();

        currentFlightsList.add(new Flight(airportsMap.get(0), airportsMap.get(1)));
        currentFlightsList.add(new Flight(airportsMap.get(2), airportsMap.get(4)));
        currentFlightsList.add(new Flight(airportsMap.get(3), airportsMap.get(5)));
        currentFlightsList.add(new Flight(airportsMap.get(0), airportsMap.get(6)));
        currentFlightsList.add(new Flight(airportsMap.get(3), airportsMap.get(7)));
        currentFlightsList.add(new Flight(airportsMap.get(4), airportsMap.get(8)));
        currentFlightsList.add(new Flight(airportsMap.get(1), airportsMap.get(8)));
    }

    public ArrayList<Flight> getCurrentFlightsList() {
        setCurrentFlightsList();
        return currentFlightsList;
    }
}
