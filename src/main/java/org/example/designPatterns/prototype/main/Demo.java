package org.example.designPatterns.prototype.main;

import org.example.designPatterns.prototype.vehicle.Bike;
import org.example.designPatterns.prototype.vehicle.Car;
import org.example.designPatterns.prototype.vehicle.Truck;
import org.example.designPatterns.prototype.vehicle.Vehicle;

public class Demo {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Forest", "Volvo", 100);
        Vehicle truckCopy = truck.clone();
        System.out.println("Original Truck: " + truck);
        System.out.println("Copied Truck: " + truckCopy);

        Vehicle bike = new Bike(2,"Suzuki", 120);
        Vehicle bikeCopy = bike.clone();
        System.out.println("Original Bike: " + bike);
        System.out.println("Copied Bike: " + bikeCopy);

        Vehicle car = new Car(true, "BMW", 130);
        Vehicle carCopy = car.clone();
        System.out.println("Original Car: " + car);
        System.out.println("Copied Car: " + carCopy);
    }
}
