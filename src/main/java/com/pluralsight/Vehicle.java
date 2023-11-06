package com.pluralsight;

public class Vehicle {
    private String fuelType;
    private int fuelCapacity;
    private String engineType;
    private int numberOfPassengers;
    private int speed;
    private String color;
    private int cargoCapacity;


    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }

    public int getFuelCapacity(){
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity){
        this.fuelCapacity = fuelCapacity;
    }

    public String getEngineType(){
        return engineType;
    }

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
