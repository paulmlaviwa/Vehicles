package com.pluralsight;

public class Hovercraft extends Vehicle {

    private boolean waterPropulsion; // Water propulsion system e.g., propellers
    private boolean airCushion; // Air cushion system for hovercraft
    private int hovercraftType; // Type of hovercraft e.g., recreational, commercial, military

    public Hovercraft(String make, String model, int year, String fuelType, int fuelCapacity, int fuelLevel, String engineType, int engineSize, int numberOfPassengers, int maxSpeed, String color, int cargoCapacity, String cargoType, double vehicleDamage) {
        super(make, model, year, fuelType, fuelCapacity, fuelLevel, engineType, engineSize, numberOfPassengers, maxSpeed, color, cargoCapacity, cargoType, vehicleDamage);
    }

    public boolean isWaterPropulsion() {
        return waterPropulsion;
    }

    public void setWaterPropulsion(boolean waterPropulsion) {
        this.waterPropulsion = waterPropulsion;
    }

    public boolean isAirCushion() {
        return airCushion;
    }

    public void setAirCushion(boolean airCushion) {
        this.airCushion = airCushion;
    }

    public int getHovercraftType() {
        return hovercraftType;
    }

    public void setHovercraftType(int hovercraftType) {
        this.hovercraftType = hovercraftType;
    }
}
