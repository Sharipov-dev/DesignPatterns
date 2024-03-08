package org.example.designPatterns.builder.components;

public class Engine {
    private double mileage;
    private double volume;
    private boolean isStarted;

    public Engine(double mileage, double volume) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public void on(){
        isStarted = true;
    }

    public void off(){
        isStarted = false;
    }

    public void go(double distance){
        if(isStarted){
            mileage += distance;
        } else{
            System.out.println("Can't go,you must start engine first");
        }
    }

    public double getMileage() {
        return mileage;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
