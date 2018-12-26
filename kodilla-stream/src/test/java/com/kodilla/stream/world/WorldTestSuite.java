package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        world.addContinent(new Continent("Europe"));
        world.addContinent(new Continent("Asia"));
        world.addContinent(new Continent("Africa"));

        List<Continent> continentsList = world.getContinents();
        continentsList.get(0).addCountry(new Country("Polska", new BigDecimal("38000000")));
        continentsList.get(0).addCountry(new Country("Niemcy", new BigDecimal("60000000")));
        continentsList.get(0).addCountry(new Country("Francja", new BigDecimal("45000000")));
        continentsList.get(1).addCountry(new Country("Chiny", new BigDecimal("1000000000")));
        continentsList.get(1).addCountry(new Country("Japonia", new BigDecimal("100000000")));
        continentsList.get(2).addCountry(new Country("Egipt", new BigDecimal("75000000")));
        continentsList.get(2).addCountry(new Country("RPA", new BigDecimal("125000000")));

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal("1443000000");

        //Then
        Assert.assertEquals(expectedPeople, worldPeopleQuantity);
    }
}
