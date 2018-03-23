package com.CreationalDesignPatterns;

public class Main {

    public static void main(String[] args) {

        runSingletonExample();

    }

    private static void runSingletonExample() {

        SingletonExample singletonExampleOne = SingletonExample.getInstance();
        SingletonExample singletonExampleTwo = SingletonExample.getInstance();

        System.out.println(singletonExampleOne == singletonExampleTwo);

    }
}
