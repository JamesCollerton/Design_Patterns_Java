package com.CreationalDesignPatterns.Factory;

import java.util.stream.Stream;

public class FactoryExample {

    public static void runFactoryExample() {

        Stream.of(ClassEnum.CLASS_ONE, ClassEnum.CLASS_TWO, ClassEnum.CLASS_THREE)
                .map(ClassFactory::getInstance)
                .map(AbstractFactoryClass::getName)
                .forEach(System.out::println);

    }

}
