package com.java.practice;

public class InstanceOfExample {
    public static void main(String[] args) {

        Object data  = "Hello, World!";

        if(data instanceof String s){
            System.out.println(s.toUpperCase());
        }
    }
}
