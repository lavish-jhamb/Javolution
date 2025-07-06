package com.java.practice;

record Person(String name, int age) {

    // Constructor is automatically generated for records, but you can define your own if needed
    public Person(String name, int age) {
        // You can add validation or other logic here if needed
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }


    // Records can have static fields
    public static final String DEFAULT_PERSON_ID = "12345";

    /**
     * Records can have instance fields, but they must be initialized in the constructor. (record Person(String name, int age) {})
     * Instance fields are not allowed in records, but you can have static fields.
     */
//    private String something;

    // You can add instance methods to a record
    public String nameInUppercase() {
        return name.toUpperCase();
    }

    // You can also add static methods to a record
    public static void printWhatever() {
        System.out.println("This is a static method in a record.");
    }

};

/**
 * Only record Person(String name, int age) {} is needed to have default pojo which will have all the necessary methods and fields auto generated.
 * Just for learning purpose, we have added some methods and fields.
 */
public class RecordExample {
    public static void main(String[] args) {
        Person person = new Person("lavish", 25);
        System.out.println(person.nameInUppercase());
        Person.printWhatever();
    }
}
