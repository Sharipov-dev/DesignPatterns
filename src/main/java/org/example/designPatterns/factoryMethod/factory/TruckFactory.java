package org.example.designPatterns.factoryMethod.factory;

import org.example.designPatterns.factoryMethod.model.Truck;
import org.example.designPatterns.factoryMethod.model.Vehicle;

public class TruckFactory implements Factory{
    @Override
    public Vehicle createNewVehicle(String model, int speed) {
        return new Truck(model, speed);
    }
}
