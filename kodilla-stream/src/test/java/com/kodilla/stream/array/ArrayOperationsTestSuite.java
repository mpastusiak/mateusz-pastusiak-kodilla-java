package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (i + 1) * 3;
        }

        //When
        ArrayOperations operations = new ArrayOperations();
        double average = operations.getAverage(numbers);

        //Then
        Assert.assertEquals(16.5, average, 0.01);
    }
}
