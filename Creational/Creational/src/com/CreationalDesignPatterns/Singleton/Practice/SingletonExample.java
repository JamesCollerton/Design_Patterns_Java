package com.CreationalDesignPatterns.Singleton.Practice;

import com.CreationalDesignPatterns.Singleton.DbSingleton;

public class SingletonExample {

    private volatile SingletonExample instance;

    private SingletonExample() {

    }

    public SingletonExample getInstance() {
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }

}
