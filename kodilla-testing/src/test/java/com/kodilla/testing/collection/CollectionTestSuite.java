package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Rozpoczęto test klasy wybierającej parzyste liczby z kolekcji");
    }
    @After
    public void after(){
        System.out.println("Zakończono test klasy wybierającej parzyste liczby z kolekcji");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> checkArray = new ArrayList<Integer>();
        ArrayList<Integer> checkOddArray = new ArrayList<Integer>();
        //When
        OddNumbersExterminator simpleArray = new OddNumbersExterminator();
        ArrayList<Integer> resultArray = simpleArray.exterminate(checkArray);
        System.out.println("Testing " + resultArray);
        //Then
        Assert.assertEquals(checkOddArray, resultArray);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> checkArray = new ArrayList<Integer>();
        ArrayList<Integer> checkOddArray = new ArrayList<Integer>();

        /* automatyczne dodawanie liczb do przykładowych tablic
        for(int i = 1; i < 10; i++){
            checkArray.add(i);
            if(i % 2 == 0){
                checkOddArray.add(i);
            }
        }
        */
        checkArray.add(1);
        checkArray.add(2);
        checkArray.add(3);
        checkArray.add(4);
        checkArray.add(5);
        checkArray.add(6);

        checkOddArray.add(2);
        checkOddArray.add(4);
        checkOddArray.add(6);
        //When
        OddNumbersExterminator simpleArray = new OddNumbersExterminator();
        ArrayList<Integer> resultArray = simpleArray.exterminate(checkArray);
        System.out.println("Testing " + resultArray);
        //Then
        Assert.assertEquals(checkOddArray, resultArray);
    }

}
