package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.Objects;

public class Airport {
    private final String airportName;
    private final String city;

    public Airport(String airportName, String city) {
        this.airportName = airportName;
        this.city = city;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airportName, airport.airportName) &&
                city.equals(airport.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportName, city);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
