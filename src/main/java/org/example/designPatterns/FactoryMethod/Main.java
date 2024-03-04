package org.example.designPatterns.FactoryMethod;

import org.example.designPatterns.FactoryMethod.factory.CarFactory;
import org.example.designPatterns.FactoryMethod.factory.Factory;
import org.example.designPatterns.FactoryMethod.factory.TruckFactory;
import org.example.designPatterns.FactoryMethod.model.Car;
import org.example.designPatterns.FactoryMethod.model.Truck;
import org.example.designPatterns.FactoryMethod.model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Factory carFactory = new CarFactory();
        Vehicle car = carFactory.createNewVehicle("BMW", 120);

        TruckFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createNewVehicle("Volvo", 80);

        car.run();
        truck.run();
    }
}
