package com.java.practice.optional;

import java.util.Optional;

/**
 *  Method      : ifPresentOrElse()
 *  Description : Allows you to handle both the present and absent cases in a single method.
 *  Benefits    : Replaces boilerplate if (optional.isPresent()) ... else ... pattern.
 */
public class IfPresentOrElseMethod {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Alice");
        name.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("value is absent")
        );


    }
}
