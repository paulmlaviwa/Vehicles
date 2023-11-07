package com.pluralsight;

public class SemiTruck extends Vehicle {
    private String trailerType;
    private int numberOfAxles;
    private String transmissionType;

    public SemiTruck(String make, String model, int year, String fuelType, int fuelCapacity, int fuelLevel, String engineType, int engineSize, int numberOfPassengers, int maxSpeed, String color, int cargoCapacity, String cargoType, double vehicleDamage) {
        super(make, model, year, fuelType, fuelCapacity, fuelLevel, engineType, engineSize, numberOfPassengers, maxSpeed, color, cargoCapacity, cargoType, vehicleDamage);
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    void refuell(){

    }
}
