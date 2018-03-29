package com.CreationalDesignPatterns.Builder.Practice;

import java.util.stream.Stream;

public class BuilderPractice {

    public static class Builder {

        private String name;
        private int age;
        private double weight;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public BuilderPractice build() {
            return new BuilderPractice(this);
        }
    }

    private String name;
    private int age;
    private double weight;

    BuilderPractice(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void print() {
        Stream.of(name, age, weight).forEach(System.out::println);
    }
}
