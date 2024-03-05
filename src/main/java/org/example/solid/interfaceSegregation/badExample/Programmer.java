package org.example.solid.interfaceSegregation.badExample;

public class Programmer implements Worker{

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }

    @Override
    public void eat() {
        System.out.println("Programmer is eating");
    }
}
