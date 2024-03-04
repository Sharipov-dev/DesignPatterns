package org.example.designPatterns.factoryMethod.factory;

import org.example.designPatterns.factoryMethod.model.Vehicle;

public interface Factory {
    public Vehicle createNewVehicle(String model, int speed);
}
