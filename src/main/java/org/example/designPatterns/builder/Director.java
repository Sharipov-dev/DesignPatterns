package org.example.designPatterns.builder;

import org.example.designPatterns.builder.builder.Builder;
import org.example.designPatterns.builder.builder.CarBuilder;
import org.example.designPatterns.builder.car.Car;
import org.example.designPatterns.builder.car.CarType;
import org.example.designPatterns.builder.components.*;
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setNumberOfSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setNumberOfSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GpsNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setNumberOfSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GpsNavigator());
    }
}


