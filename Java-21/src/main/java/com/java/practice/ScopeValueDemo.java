package com.java.practice;

import java.lang.ScopedValue;

public class ScopeValueDemo {

    private static ScopedValue<String> USER = ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.where(USER, "Alice").run(() -> {
            System.out.println("Hello " + USER.get());
        });

    }
}
