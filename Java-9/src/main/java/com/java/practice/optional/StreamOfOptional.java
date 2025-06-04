package com.java.practice.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Method      : Stream.of( optional )
 * Description : Converts an Optional into a Stream of 0 or 1 element. Very useful for combining with other stream operations.
 * Benefits    : Bridges the gap between Optional and Stream
 */
public class StreamOfOptional {

    public static void main(String[] args) {

        List<String> result = Stream.of(Optional.of("A"), Optional.empty(), Optional.of("B"))
                .flatMap(Optional::stream)
                .filter(s -> s instanceof String)
                .map(s -> (String) s)
                .toList();

        System.out.println(result);
    }

}
