package com.java.practice.garbage_collector;

public class ReferenceCountingGarbageCollector implements GarbageCollector{
    @Override
    public void initialize() {
        System.out.println("Reference Counting GC initialized.");
    }

    @Override
    public void start() {
        System.out.println("Reference Counting GC started.");
    }

    @Override
    public void stop() {
        System.out.println("Reference Counting GC stopped.");
    }

    @Override
    public void collectGarbage() {
        System.out.println("Reference Counting GC collecting garbage...");
        System.out.println("Performing reference counting phase....");  // Perform reference counting
        System.out.println("Reference Counting GC completed garbage collection.");
    }
}
