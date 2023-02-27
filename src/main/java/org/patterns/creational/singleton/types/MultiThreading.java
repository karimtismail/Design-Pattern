package org.patterns.creational.singleton.types;

public class MultiThreading {
    // volatile -> tells the compiler that the value of a variable must never be cached
    private static volatile MultiThreading instance = null;

    private MultiThreading() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static MultiThreading getInstance() {
        if (instance == null) {
            System.out.println("Before synchronized");
            // note: only synchronized the first time through!
            synchronized (MultiThreading.class) {
                System.out.println("After synchronized");
                if (instance == null) {
                    System.out.println("Creating new instance");
                    instance = new MultiThreading();
                }
            }
        }
        return instance;
    }
    public String printType() {
        return "MultiThreading class";
    }
}
