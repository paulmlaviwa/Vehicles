package com.pluralsight;

public class Car extends Vehicle {
    private boolean sunroofOpen;
    int wheels = 4;
    private String transmissionType; //Automatic or Manual

    public Car(String make, String model, int year, String fuelType, int fuelCapacity, int fuelLevel, String engineType, int engineSize, int numberOfPassengers, int maxSpeed, String color, int cargoCapacity, String cargoType, double vehicleDamage) {
        super(make, model, year, fuelType, fuelCapacity, fuelLevel, engineType, engineSize, numberOfPassengers, maxSpeed, color, cargoCapacity, cargoType, vehicleDamage);
        this.sunroofOpen = true;
        this.transmissionType = "Automatic";
    }

    public boolean isSunroofOpen() {
        return sunroofOpen;
    }

    public void setSunroofOpen(boolean sunroofOpen) {
        this.sunroofOpen = sunroofOpen;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public boolean isKeylessIgnition() {
        return false;
    }

    public void setKeylessIgnition(boolean keylessIgnition) {
    }

    void refuell(){

    }
}
