package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = theOrder.getCost();
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(15.00), theCost);
        assertEquals("Pizza with tomato sauce and cheese", theDescription);
    }

    @Test
    public void testDeepDishAndExtraCheesePizzaOrder() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DeepDishPizzaAdditionDecorator(theOrder);
        theOrder = new ExtraCheesePizzaAdditionDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(24.00), theCost);
        assertEquals("Pizza with tomato sauce and cheese + deep-dish + extra cheese", theDescription);
    }

    @Test
    public void testPizzaWithAllAdditions() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DeepDishPizzaAdditionDecorator(theOrder);
        theOrder = new ExtraCheesePizzaAdditionDecorator(theOrder);
        theOrder = new HamPizzaAdditionDecorator(theOrder);
        theOrder = new MushroomsPizzaAdditionDecorator(theOrder);
        theOrder = new PineapplePizzaAdditionDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String theDescription = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(39.50), theCost);
        assertEquals("Pizza with tomato sauce and cheese + deep-dish + extra cheese + ham + mushrooms + pineapple", theDescription);
    }
}
