package com.java.practice;

public class StringTemplateDemo {
    public static void main(String[] args) {
        int x = 10, y = 20;
        String result = STR."The sum of \{x} and \{y} is \{x + y}"; // Cleaner than "The sum of " + x + " and " + y + " is " + (x+y)
        System.out.println(result);
    }
}
