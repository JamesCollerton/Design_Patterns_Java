package com.CreationalDesignPatterns.Singleton;

public class DbSingletonRunner {

    public static void runSingletonExample() {

        basicExample();
        multithreadedExample();

    }

    private static void basicExample() {

        DbSingleton dbSingletonOne = DbSingleton.getInstance();
        DbSingleton dbSingletonTwo = DbSingleton.getInstance();

        System.out.println(dbSingletonOne == dbSingletonTwo);

    }

    private static void multithreadedExample() {

        Thread dbSingletonThreadOne = new DbSingletonCreatorThread("Thread One");
        Thread dbSingletonThreadTwo = new DbSingletonCreatorThread("Thread Two");

        try {
            dbSingletonThreadOne.start();
            dbSingletonThreadOne.join();

            dbSingletonThreadTwo.start();
            dbSingletonThreadOne.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted " + e.getMessage());
        }

    }

}
