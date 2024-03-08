package org.example.designPatterns.builder.car;

import org.example.designPatterns.builder.components.*;
public class Car {
    private final CarType carType;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GpsNavigator gpsNavigator;
    private final int numberOfSeats;
    private double fuel = 0;

    public Car(CarType carType,Engine engine, Transmission transmission, TripComputer tripComputer, GpsNavigator gpsNavigator, int numberOfSeats) {
        this.carType = carType;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getCarType() {
        return carType;
    }
    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GpsNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                ", numberOfSeats=" + numberOfSeats +
                ", fuel=" + fuel +
                '}';
    }
}
