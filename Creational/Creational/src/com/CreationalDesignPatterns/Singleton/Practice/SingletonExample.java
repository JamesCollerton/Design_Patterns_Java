package com.CreationalDesignPatterns.Singleton.Practice;

public class SingletonExample {

    private volatile SingletonExample instance;

    private SingletonExample() {

    }

    public SingletonExample getInstance() {
        if(instance == null) {
            synchronized (SingletonExample.class) {
                if(instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

}
