package com.java.practice;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person constructor called...");
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    int salary;

//    Employee(String name, int age, int salary) {
//        super(name, age); // Before java 25, This super() call must be the first statement. otherwise compilation error.
//        this.salary = salary;
//    }

    Employee(String name, int age, int salary) {
        // Flexible constructor body allows this:
        if(age > 18) {
            System.out.println("Eligible for vote...");
        }
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class FlexibleConstructorBody {
    void main() {
        Employee employee = new Employee("Lavish", 26, 3000000);
        System.out.println(employee);
    }
}
