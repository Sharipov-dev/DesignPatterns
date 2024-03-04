package org.example.designPatterns.FactoryMethod.factory;

import org.example.designPatterns.FactoryMethod.model.Car;
import org.example.designPatterns.FactoryMethod.model.Vehicle;

public class CarFactory implements Factory{


    @Override
    public Vehicle createNewVehicle(String model, int speed) {
        return new Car(model, speed);
    }
}
