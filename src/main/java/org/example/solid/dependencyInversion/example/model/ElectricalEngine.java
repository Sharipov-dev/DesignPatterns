package org.example.solid.dependencyInversion.example.model;

public class ElectricalEngine implements Engine{

    @Override
    public void run() {
        System.out.println("Electrical Engine is running");
    }
}
