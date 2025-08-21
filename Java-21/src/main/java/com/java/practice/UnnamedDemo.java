package com.java.practice;

public class UnnamedDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int _ : arr) { // value ignored
            System.out.println("Loop iteration");
        }

        Object obj = "Hello";

        if (obj instanceof String _) { // don't care about binding
            System.out.println("It is a string");
        }
    }
}
