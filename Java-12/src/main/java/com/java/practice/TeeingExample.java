package com.java.practice;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        String result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.counting(),
                        (sum, count) -> "Sum: " + sum + ", Count: " + count
                ));

        System.out.println(result);
    }
}
