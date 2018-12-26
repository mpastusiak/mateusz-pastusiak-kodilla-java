package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class World {
    private final List<Continent> continents = new ArrayList<>();

    public final void addContinent(Continent continent) {
        continents.add(continent);
    }

    public final List<Continent> getContinents() {
        return continents;
    }

    public final BigDecimal getPeopleQuantity() {
            return continents.stream()
                .map(Continent::getCountries)
                .flatMap(Set::stream)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
