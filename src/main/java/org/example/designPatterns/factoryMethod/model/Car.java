package org.example.designPatterns.factoryMethod.model;

public class Car implements Vehicle{
    private String model;
    private int speed;

    public Car(){

    }
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s is running on the speed: %s", model, speed));
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
