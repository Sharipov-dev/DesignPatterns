package org.example.solid.interfaceSegregation.badExample;

public class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {

    }
}
