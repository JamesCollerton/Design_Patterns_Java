package com.CreationalDesignPatterns.Singleton;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DbSingletonCreatorThread extends Thread {

    private String name;

    private DbSingleton dbSingleton;

    DbSingletonCreatorThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        IntStream.range(1, 10).forEach(i -> {
            try {
                sleep(10);
                System.out.println(name + " " + i);
            } catch (InterruptedException e) {
                System.out.println("Interrupted in sleep: " + e.getMessage());
            }
        });
    }

    public DbSingleton getDbSingleton() {
        return dbSingleton;
    }
}

