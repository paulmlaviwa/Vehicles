package com.pluralsight;

public class Moped extends Vehicle {
    private boolean pedaled;
    private String mopedType;
    private String scooterType;
    private boolean keylessIgnition;
    private double batteryCapacity;
    int wheels = 2;


    public Moped(String make, String model, int year, String fuelType, int fuelCapacity, int fuelLevel, String engineType, int engineSize, int numberOfPassengers, int maxSpeed, String color, int cargoCapacity, String cargoType, double vehicleDamage, boolean pedaled, String mopedType, String scooterType, boolean keylessIgnition, double batteryCapacity, int wheels, int doors) {
        super(make, model, year, fuelType, fuelCapacity, fuelLevel, engineType, engineSize, numberOfPassengers, maxSpeed, color, cargoCapacity, cargoType, vehicleDamage);
        this.pedaled = pedaled;
        this.mopedType = mopedType;
        this.scooterType = scooterType;
        this.keylessIgnition = keylessIgnition;
        this.batteryCapacity = batteryCapacity;
        this.wheels = wheels;
    }

    public boolean isPedaled() {
        return false;
    }

    public void setPedaled(boolean pedaled) {
        this.pedaled = pedaled;
    }

    public void setPedals(boolean pedals) {
        this.pedaled = false;
    }

    public String getMopedType() {
        return mopedType;
    }

    public void setMopedType(String mopedType) {
        this.mopedType = mopedType;
    }

    public String getScooterType() {
        return scooterType;
    }

    public void setScooterType(String scooterType) {
        this.scooterType = scooterType;
    }

    public boolean isKeylessIgnition() {
        return keylessIgnition;
    }

    public void setKeylessIgnition(boolean keylessIgnition) {
        this.keylessIgnition = keylessIgnition;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

}
