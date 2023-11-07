package com.pluralsight;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private int fuelCapacity;
    private int fuelLevel;
    private String engineType;
    private int engineSize;
    private int numberOfPassengers;
    private int maxSpeed;
    private String color;
    private int cargoCapacity;
    private String cargoType;
    private double vehicleDamage;


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

    public static void main(String[] args) {
        //Gasoline-Powered Car
        Car gasolineCar = new Car();
        gasolineCar.setFuelType("Gasoline");
        gasolineCar.setFuelCapacity(15);
        gasolineCar.setEngineType("Internal Combustion Engine");
        gasolineCar.setNumberOfPassengers(4);
        gasolineCar.setMaxSpeed(280);
        gasolineCar.setColor("Navy Blue");
        gasolineCar.setCargoCapacity(400);

        //Electric Car
        Car electricCar = new Car();
        electricCar.setFuelType("Electric");
        electricCar.setFuelCapacity(60);
        electricCar.setEngineType("Electric Motor");
        electricCar.setNumberOfPassengers(4);
        electricCar.setMaxSpeed(90);
        electricCar.setColor("Blue");
        electricCar.setCargoCapacity(300);

        //Diesel-Powered Semi Truck
        SemiTruck dieselTruck = new SemiTruck();
        dieselTruck.setFuelType("Diesel");
        dieselTruck.setFuelCapacity(150);
        dieselTruck.setEngineType("Diesel Engine");
        dieselTruck.setNumberOfPassengers(2);
        dieselTruck.setMaxSpeed(65);
        dieselTruck.setColor("Black");
        dieselTruck.setCargoCapacity(20000);

        //Hovercraft
        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setFuelType("Jet Fuel");
        hovercraft.setFuelCapacity(500);
        hovercraft.setEngineType("Jet Engine");
        hovercraft.setNumberOfPassengers(30);
        hovercraft.setMaxSpeed(100);
        hovercraft.setColor("White");
        hovercraft.setCargoCapacity(1000);

        //Moped
        Moped slowRide = new Moped();
        slowRide.setFuelType("Gasoline");
        slowRide.setFuelCapacity(2);
        slowRide.setEngineType("Small Engine");
        slowRide.setNumberOfPassengers(1);
        slowRide.setMaxSpeed(30);
        slowRide.setColor("Silver");
        slowRide.setCargoCapacity(10);
    }
}
