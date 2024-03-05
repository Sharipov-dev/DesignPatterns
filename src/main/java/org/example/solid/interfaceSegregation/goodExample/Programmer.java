package org.example.solid.interfaceSegregation.goodExample;

public class Programmer implements Eatable,Workable{
    @Override
    public void eat() {
        System.out.println("Programmer is eating");
    }

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }
}
