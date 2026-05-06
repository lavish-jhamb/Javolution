package com.java.practice;

import java.util.Scanner;

public class ConsoleIO {
    void main() {

        // Before java 25.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello! " + name);

        // After java 25.
        String age = IO.readln("Enter your age: ");
        System.out.println(age);
    }
}
