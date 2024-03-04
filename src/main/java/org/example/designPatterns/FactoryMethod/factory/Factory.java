package org.example.designPatterns.FactoryMethod.factory;

import org.example.designPatterns.FactoryMethod.model.Vehicle;

public interface Factory {
    public Vehicle createNewVehicle(String model, int speed);
}
