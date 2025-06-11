package com.java.practice.string_methods;

import java.util.stream.Stream;

/**
 * The lines() method splits a string into a Stream of lines based on the line terminators (\n, \r\n, etc.).
 * This is very useful when processing multi-line strings.
 */
public class LinesExample {

    public static void main(String[] args) {

        String multiLineString = "Hello,\nJava 11!\nHow are you?";

        // Using lines() to get a Stream of lines
        Stream<String> lines = multiLineString.lines();

        // Printing out each line
        lines.forEach(System.out::println);

    }

}
