package com.pluralsight;

public class Car extends Vehicle {
    private boolean sunroofOpen;
    private String transmissionType; //Automatic or Manual

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
}
