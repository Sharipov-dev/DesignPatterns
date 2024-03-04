package org.example.designPatterns.singleton;

/*
Singleton Pattern allows us to make sure that the instance
of class is created and is existed only once for the whole
program. Singleton also allows us to call object of the class
from anywhere
 */
public class Singleton {
    private static Singleton singleton;
    private String value;
    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(singleton == null){
            singleton = new Singleton(value);
        }
        return singleton;
    }


}