package org.patterns.creational.singleton.types;

public class LazyInit {
    // creation of instance when required.
    private static LazyInit instance = null;

    private LazyInit() {
    }

    public static LazyInit getInstance() {
        if (instance == null) {
            instance = new LazyInit();
        }
        return instance;
    }

    public String printType() {
        return "Lazy Singleton Loaded";
    }
}
