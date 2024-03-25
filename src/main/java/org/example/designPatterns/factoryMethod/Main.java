package org.example.designPatterns.factoryMethod;

import org.example.designPatterns.factoryMethod.factory.CarFactory;
import org.example.designPatterns.factoryMethod.factory.Factory;
import org.example.designPatterns.factoryMethod.factory.TruckFactory;
import org.example.designPatterns.factoryMethod.model.Vehicle;



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
