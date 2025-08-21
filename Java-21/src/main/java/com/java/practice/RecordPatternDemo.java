package com.java.practice;

record Point(int x, int y) { }

public class RecordPatternDemo {
    public static void main(String[] args) {
        Point p = new Point(10, 20);

        if (p instanceof Point(int x, int y)) {
            System.out.println("Destructure x = " + x);
            System.out.println("Destructure y = " + y);
        }
    }
}
