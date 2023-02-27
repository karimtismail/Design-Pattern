package org.patterns.creational.singleton.types;

public class EagerInit {
    // creation of instance at load time.
    private static EagerInit instance = new EagerInit();

    private EagerInit() {
    }

    public static EagerInit getInstance() {
        return instance;
    }

    public String printType() {
        return "Early Singleton Loaded";
    }
}
