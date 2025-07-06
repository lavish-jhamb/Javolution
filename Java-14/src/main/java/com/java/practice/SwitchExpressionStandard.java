package com.java.practice;

public class SwitchExpressionStandard {

    public static void main(String[] args) {

        int dayNumber = 5;

        String dayType = switch(dayNumber) {
            case 1,2,3,4,5 -> "Weekday";
            case 6,7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + dayNumber);
        };

        System.out.println(dayType);

    }

}
