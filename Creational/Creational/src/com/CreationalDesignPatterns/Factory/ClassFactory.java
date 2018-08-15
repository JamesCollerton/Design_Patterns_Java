package com.CreationalDesignPatterns.Factory;

public class ClassFactory {

    public static AbstractFactoryClass getInstance(ClassEnum classEnum) {
        switch (classEnum) {
            case CLASS_ONE:
                return new ClassOne();
            case CLASS_TWO:
                return new ClassTwo();
            case CLASS_THREE:
                return new ClassThree();
            default:
                break;
        }
        return null;
    }

}
