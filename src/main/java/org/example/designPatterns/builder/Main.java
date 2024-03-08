package org.example.designPatterns.builder;

import org.example.designPatterns.builder.builder.Builder;
import org.example.designPatterns.builder.builder.CarBuilder;
import org.example.designPatterns.builder.car.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car sportCar = carBuilder.build();
        Car sportCar2 = carBuilder.build();

        director.constructCityCar(carBuilder);

        Car cityCar = carBuilder.build();

        director.constructSUV(carBuilder);
        Car suvCar = carBuilder.build();
        
    }
}
