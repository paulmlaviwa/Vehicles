package com.pluralsight;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;
    protected int fuelCapacity;
    protected int fuelLevel;
    protected String engineType;
    protected int engineSize;
    protected int numberOfPassengers;
    protected int maxSpeed;
    protected String color;
    protected int cargoCapacity;
    protected String cargoType;
    protected double vehicleDamage;


    //Setters and Getters
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getVehicleDamage() {
        return vehicleDamage;
    }

    public void setVehicleDamage(double vehicleDamage) {
        this.vehicleDamage = vehicleDamage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void start(){

    }

    public void accelerate(){

    }

    public void stop(){

    }

    public Vehicle(String make, String model, int year, String fuelType, int fuelCapacity, int fuelLevel, String engineType, int engineSize, int numberOfPassengers, int maxSpeed, String color, int cargoCapacity, String cargoType, double vehicleDamage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
        this.engineType = engineType;
        this.engineSize = engineSize;
        this.numberOfPassengers = numberOfPassengers;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
        this.cargoType = cargoType;
        this.vehicleDamage = vehicleDamage;
    }
}
