package com.java.practice;

public class SwitchExpression {

    public static void main(String[] args) {

        String day = "MONDAY";

        // In java 12 - Returning a value from switch expression
        int dayNumber = switch (day) {
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY" -> 6;
            default -> 0;
        };
        System.out.println("New switch result: " + dayNumber);
    }
}

