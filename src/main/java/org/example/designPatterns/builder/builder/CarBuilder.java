package org.example.designPatterns.builder.builder;

import org.example.designPatterns.builder.car.Car;
import org.example.designPatterns.builder.car.CarType;
import org.example.designPatterns.builder.components.Engine;
import org.example.designPatterns.builder.components.GpsNavigator;
import org.example.designPatterns.builder.components.Transmission;
import org.example.designPatterns.builder.components.TripComputer;

public class CarBuilder implements Builder{
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GpsNavigator gpsNavigator;
    private int numberOfSeats;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer=tripComputer;
    }

    @Override
    public void setGpsNavigator(GpsNavigator gpsNavigator) {
        this.gpsNavigator=gpsNavigator;
    }

    @Override
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats=numberOfSeats;
    }

    @Override
    public Car build(){
        return new Car(carType,engine,transmission,tripComputer, gpsNavigator,numberOfSeats);
    }
}
