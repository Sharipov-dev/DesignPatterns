package org.example.designPatterns.FactoryMethod.factory;

import org.example.designPatterns.FactoryMethod.model.Truck;
import org.example.designPatterns.FactoryMethod.model.Vehicle;

public class TruckFactory implements Factory{
    @Override
    public Vehicle createNewVehicle(String model, int speed) {
        return new Truck(model, speed);
    }
}
