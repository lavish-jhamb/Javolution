package com.java.practice;

import java.util.concurrent.Executors;

public class VirtualThreadDemo {
    public static void main(String[] args) {

        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for(int i=1; i<5; i++){
                Thread.sleep(500);
                int taskId = i;
                executor.submit(() -> {
                    System.out.println("Task " + taskId + " on " + Thread.currentThread());
                });
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
