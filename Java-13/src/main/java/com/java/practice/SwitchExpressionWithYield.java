package com.java.practice;

/**
 * What if you need to do more than a single statement,
 * like call a method or run several lines in a case?
 * You can use a block—and now, you must explicitly use yield to return a value from the block
 */
public class SwitchExpressionWithYield {

    public static void main(String[] args) {
        int day = 2;

        String dayType = switch (day) {
            case 1, 7 -> "Weekend";
            case 2,3,4,5,6 -> {
                System.out.println("It's a weekday!");
                yield "Weekday"; // yield is used to return a value from the block
            }
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(dayType);

    }

}
