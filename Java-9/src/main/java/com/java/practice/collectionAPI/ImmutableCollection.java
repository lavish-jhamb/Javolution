package com.java.practice.collectionAPI;

import java.util.List;

/**
 * DESCRIPTION     - Factory methods for collections(like List, Map, Set and Map.Entry) List and Set interfaces have “of()” methods to create an empty or no-empty Immutable List or Set objects
 * PRIOR TO JAVA 9 - We need to add elements by several "add" calls.
 * NOTE            - immutableList.add(anyThing()) will result into error.
 */
public class ImmutableCollection {

    private static List<Number> immutableList = List.of(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        for (Number i : immutableList) {
            System.out.println(i);
        }
    }
}
