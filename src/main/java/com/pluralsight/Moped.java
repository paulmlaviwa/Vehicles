package com.pluralsight;

public class Moped extends Vehicle {
    private boolean pedaled;
    private String mopedType;
    private String scooterType;
    private boolean keylessIgnition;
    private double batteryCapacity;


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
