package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.List;

class SearchConnection {
    private final Airport connectionFromAirport;
    private final Airport connectionToAirport;

    private final SearchFlights searchFlights = new SearchFlights();

    public SearchConnection(String connectionFrom, String connectionTo) {
        CurrentAirportsList currentAirportsList = new CurrentAirportsList();

        this.connectionFromAirport = currentAirportsList.getAirportFromCurrentList(connectionFrom);
        this.connectionToAirport = currentAirportsList.getAirportFromCurrentList(connectionTo);
    }

    public void getSearchConnectionResult() {
        try {
            if (connectionFromAirport != null && connectionToAirport != null) {
                List<ConnectingFlight> result = searchFlights.searchConnectingFlights(connectionFromAirport, connectionToAirport);
                System.out.println("All connecting flights from " + connectionFromAirport + " to " + connectionToAirport);
                System.out.println(result);

            } else if (connectionFromAirport != null) {
                List<Flight> result = searchFlights.searchFlightsFrom(connectionFromAirport);
                System.out.println("All connections from " + connectionFromAirport);
                System.out.println(result);

            } else {
                List<Flight> result = searchFlights.searchFlightsTo(connectionToAirport);
                System.out.println("All connections to " + connectionToAirport);
                System.out.println(result);
            }
        } catch (NullPointerException e) {
            invalidSearchValue();
        }
    }

    private void invalidSearchValue() {
        System.out.println("Can't find connection from/to this City!");
    }
}
