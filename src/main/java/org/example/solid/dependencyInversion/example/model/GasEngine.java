package org.example.solid.dependencyInversion.example.model;

public class GasEngine implements Engine{


    @Override
    public void run() {
        System.out.println("Gas Engine is running");
    }
}
