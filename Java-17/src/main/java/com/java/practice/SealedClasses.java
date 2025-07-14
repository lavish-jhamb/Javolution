package com.java.practice;

sealed class Shape permits Circle, Rectangle {
};


final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class SealedClasses {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        if (circle instanceof Circle c) {
            System.out.println("Circle with radius: " + c.getRadius());
        }

        if (rectangle instanceof Rectangle r) {
            System.out.println("Rectangle with length: " + r.getLength() + " and width: " + r.getWidth());
        }
    }
}
