package org.example.solid.dependencyInversion.example;

import org.example.solid.dependencyInversion.example.model.Car;
import org.example.solid.dependencyInversion.example.model.ElectricalEngine;
import org.example.solid.dependencyInversion.example.model.GasEngine;

public class Main {


    public static void main(String[] args) {
        Car electricalCar = new Car(new ElectricalEngine());
        electricalCar.run();
        Car  gasCar = new Car(new GasEngine());
        gasCar.run();
    }
}
