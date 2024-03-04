package org.example.designPatterns.prototype.shapes;

public class Truck extends Vehicle{
    private String trailerType;

    public String getTrailerType() {
        return trailerType;
    }
    public void setTrailerType(String trailerType){
        this.trailerType =trailerType;
    }

    public Truck(String trailerType, String model, int speed) {
        this.trailerType = trailerType;
        this.setModel(model);
        this.setSpeed(speed);
    }

    public Truck(Truck truck){
        super(truck);
        if(truck != null){
            this.trailerType = truck.getTrailerType();
        }
    }
    @Override
    public Vehicle clone() {
        return new Truck(this);
    }

    @Override
    public String toString() {
        return "Truck{" +
                " trailerType=" + trailerType +
                " speed=" + getSpeed() +
                " model=" + getModel() +
                '}';
    }
}
