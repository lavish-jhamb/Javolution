package com.java.practice.streamAPI;

import java.util.List;
import java.util.stream.Stream;

/**
 * DESCRIPTION - Java 9 introduced several enhancements to the Stream API that improved its power and flexibility for functional-style data processing. Below are the key enhancements with examples:
 */
public class Improvements {

    /**
     * METHOD - takeWhile()
     * DESCRIPTION - Returns a stream consisting of the longest prefix of elements that match the given predicate.
     * EXAMPLE - Processing stops as soon as the predicate returns false (6 >= 5), even though 4 and 5 match afterward.
     */
    private static void takeWhile() {
        List<Integer> numbers = List.of(1, 2, 3, 6, 4, 5);
        List<Integer> list = numbers.stream().takeWhile(n -> n < 5).toList();
        System.out.println(list);
    }

    /**
     * METHOD - dropWhile()
     * DESCRIPTION - Skips the longest prefix of elements that match the predicate and returns the rest.
     * EXAMPLE - It skips the initial elements < 5, and includes the rest starting from the first failure (6).
     */
    private static void dropWhile() {
        List<Integer> numbers = List.of(1, 2, 3, 6, 4, 5);
        List<Integer> list = numbers.stream().dropWhile(n -> n < 5).toList();
        System.out.println(list);
    }

    /**
     * METHOD - ofNullable()
     * DESCRIPTION - Creates a stream with a single element or an empty stream if the element is null.
     * NOTE - Prevents NullPointerException and is useful when working with potentially null values.
     */
    private static void ofNullable() {
        Stream<String> stream1 = Stream.ofNullable("Hello");
        Stream<String> stream2 = Stream.ofNullable(null);
        System.out.println(stream1.count());
        System.out.println(stream2.count());
    }

    /**
     * METHOD - Improved iterate()
     * DESCRIPTION - New overloaded version of Stream.iterate() that takes a predicate (similar to a while loop).
     * NOTE - Cleaner and safer than limit() when you want to stop conditionally.
     */
    private static void iterate() {
        List<Integer> list = Stream.iterate(1, n -> n < 10, n -> n + 2).toList();
        System.out.println(list);
    }

    /**
     * ✅ Summary Table:
     * Feature	        Description	                                Introduced In
     * takeWhile()	    Takes elements until predicate fails	    Java 9
     * dropWhile()	    Drops elements until predicate fails	    Java 9
     * ofNullable()	    Creates stream from nullable element	    Java 9
     * iterate()	    Adds conditional loop termination	        Java 9
     */
    public static void main(String[] args) {

    }

}

