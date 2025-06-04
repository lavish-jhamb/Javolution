package com.java.practice.garbage_collector;

public class MarkAndSweepGarbageCollector implements GarbageCollector {
    @Override
    public void initialize() {
        System.out.println("Mark-and-Sweep GC initialized.");
    }

    @Override
    public void start() {
        System.out.println("Mark-and-Sweep GC started.");
    }

    @Override
    public void stop() {
        System.out.println("Mark-and-Sweep GC stopped.");
    }

    @Override
    public void collectGarbage() {
        System.out.println("Mark-and-Sweep GC collecting garbage...");
        System.out.println("Performing mark phase....");    // Perform mark phase
        System.out.println("Performing sweep phase....");   // Perform sweep phase
        System.out.println("Mark-and-Sweep GC completed garbage collection.");
    }
}
