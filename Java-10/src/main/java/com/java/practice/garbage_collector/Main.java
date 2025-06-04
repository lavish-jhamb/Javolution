package com.java.practice.garbage_collector;

public class Main {

    public static void main(String[] args) {
        var markAndSweepGC = new MarkAndSweepGarbageCollector();
        var referenceCountingGC = new ReferenceCountingGarbageCollector();

        manageGarbageCollector(markAndSweepGC);
        manageGarbageCollector(referenceCountingGC);
    }

    private static void manageGarbageCollector(GarbageCollector gc) {
        gc.initialize();
        gc.start();
        gc.collectGarbage();
        gc.stop();
    }

}
