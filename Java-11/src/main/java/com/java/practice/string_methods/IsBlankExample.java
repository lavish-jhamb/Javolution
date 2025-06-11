package com.java.practice.string_methods;


/**
 * The isBlank() method checks if a string is empty or contains only whitespace characters.
 * It’s different from isEmpty() because isEmpty() only checks if the length of the string is zero,
 * whereas isBlank() also considers whitespace characters.
 */
public class IsBlankExample {

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "   ";
        String str3 = "Hello";

        System.out.println(str1.isBlank()); // true (empty string)
        System.out.println(str2.isBlank()); // true (only spaces)
        System.out.println(str3.isBlank()); // false
    }

}
