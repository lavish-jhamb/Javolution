package com.java.practice;

public class SwitchPatternDemo {

    private static String formatter(Object data) {
        return switch (data) {
            case Integer i -> "Integer: " + i;
            case String s when s.length() > 5 -> "Long String: " + s;
            case String s -> "Short String: " + s;
            case null -> "Null Value";
            default -> "Unknown Type";
        };
    }

    public static void main(String[] args) {
        System.out.println(formatter("Lavish"));
    }
}
