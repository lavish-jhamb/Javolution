package com.java.practice.garbage_collector;

public interface GarbageCollector {
    void initialize();
    void start();
    void stop();
    void collectGarbage();
}
