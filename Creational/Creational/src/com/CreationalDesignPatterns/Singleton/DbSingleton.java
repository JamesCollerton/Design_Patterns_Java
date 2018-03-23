package com.CreationalDesignPatterns.Singleton;

public class DbSingleton {

    private static volatile DbSingleton dbSingleton = null;

    private String value;

    private DbSingleton() {
        if(dbSingleton != null) {
            throw new RuntimeException("Use getInstance to create.");
        }
        value = "Singleton Value";
    }

    public static DbSingleton getInstance() {
        if(dbSingleton == null) {
            synchronized (DbSingleton.class) {
                if(dbSingleton == null) {
                    dbSingleton = new DbSingleton();
                }
            }
        }
        return dbSingleton;
    }

    public String getValue() {
        return value;
    }
}
