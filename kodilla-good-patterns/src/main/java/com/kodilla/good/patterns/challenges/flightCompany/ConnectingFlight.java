package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.Objects;

class ConnectingFlight {
    private final Flight firstFlight;
    private final Flight secondFlight;

    public ConnectingFlight(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConnectingFlight that = (ConnectingFlight) o;
        return firstFlight.equals(that.firstFlight) &&
                secondFlight.equals(that.secondFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstFlight, secondFlight);
    }

    @Override
    public String toString() {
        return "ConnectingFlight{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}