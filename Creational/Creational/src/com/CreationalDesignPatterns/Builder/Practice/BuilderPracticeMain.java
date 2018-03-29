package com.CreationalDesignPatterns.Builder.Practice;

public class BuilderPracticeMain {

    public static void main(String[] args) {

        BuilderPractice.Builder builder = new BuilderPractice.Builder();

        BuilderPractice builderPractice = builder.age(5).name("Name").weight(10.5).build();

        builderPractice.print();

    }

}
