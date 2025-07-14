package com.java.practice;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        Object data = "Hello, Java 17";

        var result = switch (data) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null value";
            default -> "Unknown type: " + data.getClass().getName();
        };

        System.out.println(result);
    }
}
