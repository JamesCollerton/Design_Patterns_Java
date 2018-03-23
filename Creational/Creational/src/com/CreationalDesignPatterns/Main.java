package com.CreationalDesignPatterns;

import static com.CreationalDesignPatterns.Builder.LunchOrderBeanRunner.runBuilderExample;
import static com.CreationalDesignPatterns.Singleton.DbSingletonRunner.runSingletonExample;

public class Main {

    public static void main(String[] args) {

        runSingletonExample();
        runBuilderExample();

    }
}
