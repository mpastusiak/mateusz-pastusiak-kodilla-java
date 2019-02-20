package com.kodilla.good.patterns.challenges.flightCompany;

public class SearchApplication {
    public static void main(String[] args) {
        SearchFlightsFrom searchFlights = new SearchFlightsFrom();

        CurrentAirportsMap currentAirportsMap = new CurrentAirportsMap();

        String searchingFrom = "Gdansk";
        String searchingTo = "Berlin";

        System.out.println(searchFlights.searchFlightsFrom(currentAirportsMap.getAirportFromCurrentList(searchingFrom)));
        System.out.println(searchFlights.searchFlightsTo(currentAirportsMap.getAirportFromCurrentList(searchingTo)));
        System.out.println(searchFlights.searchConnectingFlights(currentAirportsMap.getAirportFromCurrentList(searchingFrom),
                currentAirportsMap.getAirportFromCurrentList(searchingTo)));


    }
}
