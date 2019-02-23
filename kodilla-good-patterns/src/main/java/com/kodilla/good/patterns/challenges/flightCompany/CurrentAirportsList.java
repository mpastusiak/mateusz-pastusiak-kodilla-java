package com.kodilla.good.patterns.challenges.flightCompany;

import java.util.ArrayList;

class CurrentAirportsList {
    private final ArrayList<Airport> currentAirportsList = new ArrayList<>();

    private void setCurrentAirportsList() {
        currentAirportsList.add(new Airport("Walesa Airport", "Gdansk"));
        currentAirportsList.add(new Airport("Lawica Airport", "Poznan"));
        currentAirportsList.add(new Airport(null, "Radom"));
        currentAirportsList.add(new Airport("Okecie Airport", "Warsaw"));
        currentAirportsList.add(new Airport("John Paul II Airport", "Krakow"));
        currentAirportsList.add(new Airport(null, "Katowice"));
        currentAirportsList.add(new Airport(null, "London"));
        currentAirportsList.add(new Airport(null, "Moscow"));
        currentAirportsList.add(new Airport(null, "Berlin"));
    }

    public ArrayList<Airport> getCurrentAirportsList() {
        setCurrentAirportsList();
        return currentAirportsList;
    }

    public Airport getAirportFromCurrentList(String city) {
        Airport resultAirport = null;
        for(Airport airport : getCurrentAirportsList()) {
            if(airport.getCity().equals(city)) {
                resultAirport = airport;
                break;
            }
        }
        return resultAirport;
    }
}
