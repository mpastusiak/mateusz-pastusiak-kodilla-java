package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public final void addCountry(Country country) {
        countries.add(country);
    }

    public final Set<Country> getCountries() {
        return countries;
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
