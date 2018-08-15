package com.CreationalDesignPatterns.Factory;

public class ClassOne extends AbstractFactoryClass {

    @Override
    public void createFactoryObject() {
        this.name = "ClassOne";
    }
}
