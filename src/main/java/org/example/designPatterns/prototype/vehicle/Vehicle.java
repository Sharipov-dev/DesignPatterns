package org.example.designPatterns.prototype.vehicle;

import java.util.Objects;

public abstract class Vehicle {
    private int speed;
    private String model;

    public Vehicle(){

    }
    public Vehicle(Vehicle vehicle){
        if(vehicle != null){
            this.model = vehicle.model;
            this.speed = vehicle.speed;
        }
    }
    public abstract Vehicle clone();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && Objects.equals(model, vehicle.model);
    }
}
