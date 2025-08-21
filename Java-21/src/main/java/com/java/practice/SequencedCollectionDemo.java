package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionDemo {
    public static void main(String[] args) {
        SequencedCollection<String> names = new ArrayList<>(List.of("A", "B", "C"));

        System.out.println(names.getFirst()); // A
        System.out.println(names.getLast()); // C

        names.addFirst("X");
        names.addLast("Y");

        System.out.println(names);  // [X, A, B, C, Y]

        System.out.println(names.reversed()); // [Y, C, B, A, X]

        names.removeFirst(); // remove X
        names.removeLast(); // remove Y

        System.out.println(names); // [A,B,C]

    }
}
