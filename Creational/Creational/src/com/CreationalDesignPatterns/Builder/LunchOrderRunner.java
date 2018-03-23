package com.CreationalDesignPatterns.Builder;

import java.util.stream.Stream;

public class LunchOrderRunner {

    public static void runBuilderExample() {

        basicExample();

    }

    private static void basicExample() {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        Stream.of(lunchOrder.getBread(), lunchOrder.getCondiments(), lunchOrder.getDressing(), lunchOrder.getMeat()).forEach(System.out::println);

    }

}
