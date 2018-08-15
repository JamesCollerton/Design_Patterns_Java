package com.CreationalDesignPatterns.Factory;

public abstract class AbstractFactoryClass {

    protected String name;

    AbstractFactoryClass() {
        this.createFactoryObject();
    }

    public abstract void createFactoryObject();

    public String getName() {
        return name;
    }
}
