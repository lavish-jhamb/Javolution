package com.java.practice.optional;

import java.util.Optional;

/**
 * Method      : or( Supplier )
 * Description : Returns the current Optional if it has a value, or another Optional provided by a supplier.
 * Benefits    : Handy for chaining fallback Optional values.
 */
public class OrMethod {

    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        Optional<String> fallback = Optional.of("Default");

        String result = name.or(() -> fallback).get();

        System.out.println(result);

    }
}
