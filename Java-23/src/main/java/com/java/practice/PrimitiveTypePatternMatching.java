package com.java.practice;

public class PrimitiveTypePatternMatching {
    public static void main(String[] args) {
        Object data = 10;

        if(data instanceof Integer i) {
            System.out.println(i);
        }

        if(data instanceof int i){
            System.out.println(i);
        }
    }
}
