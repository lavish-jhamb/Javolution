package com.java.practice;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String message = null;
        try {
            int n = message.length(); // This will throw NullPointerException
        }catch (Exception e){
            e.printStackTrace();      // Example output: java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        }
    }
}
