package com.CreationalDesignPatterns;

public class SingletonExample {

    private static SingletonExample singletonExample;

    private String value;

    private SingletonExample() {
        value = "Singleton Value";
    }

    public static SingletonExample getInstance() {
        if(singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public String getValue() {
        return value;
    }
}
