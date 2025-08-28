package com.java.practice;

class Base {
    int value;

    public Base(int value) {
        this.value = value;
    }
}

class Derived extends Base {
    private static int THRESHOLD = 10;
    int derivedValue;

    public Derived(int derivedValue) {
        if (derivedValue > THRESHOLD) {
            derivedValue = THRESHOLD;
        }
        super(derivedValue);
        this.derivedValue = derivedValue * 2;
    }
}

public class SuperConstructorExample {
    public static void main(String[] args) {
        Derived derived = new Derived(20);
        System.out.println(derived.derivedValue);
    }
}
