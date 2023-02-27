package org.patterns.creational.singleton;

import org.patterns.creational.singleton.databaseConnectionExample.DatabaseConnection;
import org.patterns.creational.singleton.types.EagerInit;
import org.patterns.creational.singleton.types.LazyInit;
import org.patterns.creational.singleton.types.MultiThreading;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /*
        // Early
        System.out.println(EagerInit.getInstance().printType());
        // Lazy
        System.out.println(LazyInit.getInstance().printType());
        // MultiThreading
        new Thread(() -> {
            System.out.println(MultiThreading.getInstance().printType());
        }).start();
        System.out.println();
        new Thread(() -> {
            System.out.println(MultiThreading.getInstance().printType());
        }).start();
        System.out.println();
        System.out.println(MultiThreading.getInstance().printType());
        */
        try {
            DatabaseConnection.getInstance().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
