package com.java.practice.string_methods;

/**
 * The repeat() method repeats a string a specified number of times and returns a new string.
 */
public class RepeatExample {

    public static void main(String[] args) {

        String str = "java";

        System.out.println(str.repeat(0)); // ""
        System.out.println(str.repeat(1)); // "Java"
        System.out.println(str.repeat(3)); // "JavaJavaJava"

    }

}
