package com.java.practice;

sealed class A permits B, C {

}

non-sealed class B extends A {

}

final class C extends A {

}

class D extends B {

}


public class SealedClassExample {
    public static void main(String[] args) {

    }
}
