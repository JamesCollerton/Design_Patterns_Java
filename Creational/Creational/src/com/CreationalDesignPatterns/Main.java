package com.CreationalDesignPatterns;

public class Main {

    public static void main(String[] args) {

        runSingletonExample();

    }

    private static void runSingletonExample() {

        DbSingleton dbSingletonOne = DbSingleton.getInstance();
        DbSingleton dbSingletonTwo = DbSingleton.getInstance();

        System.out.println(dbSingletonOne == dbSingletonTwo);

    }
}
