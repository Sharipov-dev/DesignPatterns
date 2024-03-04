package org.example.designPatterns.factoryMethod.factory;

import org.example.designPatterns.factoryMethod.model.Car;
import org.example.designPatterns.factoryMethod.model.Vehicle;

public class CarFactory implements Factory{


    @Override
    public Vehicle createNewVehicle(String model, int speed) {
        return new Car(model, speed);
    }
}
