package com.java.practice.unnamed;

import java.util.List;

public class UnnamedLambdaExample {
    public static void main(String[] args) {

        List<String> names = List.of("Lavish", "Reyna");

        // Traditional way
        names.forEach(name -> System.out.println(name));

        // Using unnamed variable in lambda
        names.forEach(_ -> System.out.println("Hello"));
    }
}
