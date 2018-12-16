package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(2,3);
        int equalsAddResult = 5;

        if(addResult == equalsAddResult) {
            System.out.println("ADD test OK - wynik " + equalsAddResult);
        } else {
            System.out.println("ADD test ERROR");
        }

        int subtractResult = calculator.subtract(9,3);
        int equalsSubtractResult = 6;

        if(subtractResult == equalsSubtractResult) {
            System.out.println("SUBTRACT test OK - wynik " + equalsSubtractResult);
        } else {
            System.out.println("SUBTRACT test ERROR");
        }

    }
}