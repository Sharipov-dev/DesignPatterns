package org.example.designPatterns.prototype.shapes;

public class Bike extends Vehicle{
    private int numberOfWheels;

    public Bike(){

    }
    public Bike(int numberOfWheels, String model, int speed){
        this.numberOfWheels = numberOfWheels;
        this.setModel(model);
        this.setSpeed(speed);
    }

    public Bike(Bike bike){
        super(bike);
        if(bike != null){
            this.numberOfWheels = bike.numberOfWheels;
        }

    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public Vehicle clone() {
        return new Bike(this);
    }

    @Override
    public String toString() {
        return "Bike{" +
                " numberOfWheels=" + numberOfWheels +
                " speed=" + getSpeed() +
                " model=" + getModel() +
                '}';
    }
}
