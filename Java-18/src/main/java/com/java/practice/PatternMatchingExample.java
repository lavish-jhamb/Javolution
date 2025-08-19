package com.java.practice;

public class PatternMatchingExample {

    private static String formatter(Object data) {
        return switch (data) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null Value";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        Object data = null;
        String result = formatter(data);
        System.out.println(result);
    }
}
