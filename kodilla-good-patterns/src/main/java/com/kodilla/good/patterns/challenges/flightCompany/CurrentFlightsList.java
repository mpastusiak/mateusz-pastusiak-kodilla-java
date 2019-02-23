package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;

class CurrentFlightsList {
    private final ArrayList<Flight> currentFlightsList = new ArrayList<>();

    private void setCurrentFlightsList() {
        CurrentAirportsList currentAirports = new CurrentAirportsList();
        ArrayList<Airport> airportsMap = currentAirports.getCurrentAirportsList();

        currentFlightsList.add(new Flight(airportsMap.get(0), airportsMap.get(1)));
        currentFlightsList.add(new Flight(airportsMap.get(2), airportsMap.get(4)));
        currentFlightsList.add(new Flight(airportsMap.get(3), airportsMap.get(5)));
        currentFlightsList.add(new Flight(airportsMap.get(0), airportsMap.get(6)));
        currentFlightsList.add(new Flight(airportsMap.get(3), airportsMap.get(7)));
        currentFlightsList.add(new Flight(airportsMap.get(4), airportsMap.get(8)));
        currentFlightsList.add(new Flight(airportsMap.get(0), airportsMap.get(8)));
        currentFlightsList.add(new Flight(airportsMap.get(1), airportsMap.get(7)));
        currentFlightsList.add(new Flight(airportsMap.get(2), airportsMap.get(6)));
        currentFlightsList.add(new Flight(airportsMap.get(3), airportsMap.get(4)));
        currentFlightsList.add(new Flight(airportsMap.get(4), airportsMap.get(5)));
        currentFlightsList.add(new Flight(airportsMap.get(5), airportsMap.get(3)));
        currentFlightsList.add(new Flight(airportsMap.get(6), airportsMap.get(0)));
        currentFlightsList.add(new Flight(airportsMap.get(7), airportsMap.get(1)));
        currentFlightsList.add(new Flight(airportsMap.get(0), airportsMap.get(2)));
    }

    public ArrayList<Flight> getCurrentFlightsList() {
        setCurrentFlightsList();
        return currentFlightsList;
    }
}
