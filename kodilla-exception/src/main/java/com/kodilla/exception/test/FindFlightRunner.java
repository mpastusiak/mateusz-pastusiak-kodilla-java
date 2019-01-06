package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {
        String departureAirport = "Warsaw";
        String arrivalAirport = "Moscow";
        Flight flight = new Flight(departureAirport, arrivalAirport);
        FindFlight findFlightFromTo = new FindFlight();

        try {
            findFlightFromTo.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("I can't find a flight from " + departureAirport + " to " + arrivalAirport + " :(");
        } finally {
            System.out.println("Thanks for using!");
        }

    }
}
