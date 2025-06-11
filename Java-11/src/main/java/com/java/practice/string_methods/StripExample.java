package com.java.practice.string_methods;

/**
 * These methods remove unnecessary whitespace from a string. Unlike trim(), which only removes ASCII whitespace, strip() works with all Unicode whitespace.
 *  - strip(): Removes both leading and trailing whitespace.
 *  - stripLeading(): Removes only leading whitespace.
 *  - stripTrailing(): Removes only trailing whitespace.
 */
public class StripExample {

    public static void main(String[] args) {

        String str = "  Hello, Java 11!   ";

        System.out.println("Original String: '" + str + "'");
        System.out.println("strip(): '" + str.strip() + "'");
        System.out.println("stripLeading(): '" + str.stripLeading() + "'");
        System.out.println("stripTrailing(): '" + str.stripTrailing() + "'");

    }

}
