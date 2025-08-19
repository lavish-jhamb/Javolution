package com.java.practice;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadExample {
    public static void main(String[] args) throws Exception {
        // Run 1000 tasks with virtual thread
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 1000).forEach(i -> {
                executor.submit(() -> {
                    System.out.println("Task " + i + " executed by " + Thread.currentThread());
                });
            });
        }
    }
}
