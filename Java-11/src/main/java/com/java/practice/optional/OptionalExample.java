package com.java.practice.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> name1 = Optional.of("Lavish");
        System.out.println(name1.isEmpty());

        Optional<String> name2 = Optional.empty();
        System.out.println(name2.isEmpty());

    }

}
