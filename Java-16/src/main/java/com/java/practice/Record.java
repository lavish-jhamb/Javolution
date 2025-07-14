package com.java.practice;

record Person(String name, int age) {};

public class Record {

    public static void main(String[] args) {
        Person person = new Person("Lavish", 25);
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println("Person: " + person);
    }
}
