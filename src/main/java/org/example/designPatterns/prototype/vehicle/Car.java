package org.example.designPatterns.prototype.vehicle;

public class Car extends Vehicle{

    private boolean hasSpoiler;

    public Car(){

    }

    public Car(boolean hasSpoiler, String model, int speed) {
        this.setModel(model);
        this.setSpeed(speed);
        this.hasSpoiler = hasSpoiler;
    }

    public Car(Car car){
        super(car);
        if(car != null){
            this.hasSpoiler = car.hasSpoiler();
        }
    }

    public boolean hasSpoiler() {
        return hasSpoiler;
    }

    public void setHasSpoiler(boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);

    }

    @Override
    public String toString() {
        return "Car{" +
                " hasSpoiler=" + hasSpoiler +
                " speed=" + getSpeed() +
                " model=" + getModel() +
                '}';
    }
}
