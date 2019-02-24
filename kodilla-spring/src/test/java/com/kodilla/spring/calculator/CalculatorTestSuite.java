package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double add = calculator.add(1, 2);
        Double sub = calculator.sub(4, 3);
        Double mul = calculator.mul(5, 6);
        Double div = calculator.div(7, 2);
        //Then
        Assert.assertEquals(3, add, 0.01);
        Assert.assertEquals(1, sub, 0.01);
        Assert.assertEquals(30, mul, 0.01);
        Assert.assertEquals(3.5, div, 0.01);
    }
}
