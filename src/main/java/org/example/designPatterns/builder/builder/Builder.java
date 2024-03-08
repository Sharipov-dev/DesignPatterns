package org.example.designPatterns.builder.builder;

import org.example.designPatterns.builder.car.Car;
import org.example.designPatterns.builder.car.CarType;
import org.example.designPatterns.builder.components.Engine;
import org.example.designPatterns.builder.components.GpsNavigator;
import org.example.designPatterns.builder.components.Transmission;
import org.example.designPatterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GpsNavigator gpsNavigator);
    void setNumberOfSeats(int numberOfSeats);
    Car build();
}
