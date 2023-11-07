package com.pluralsight;

public class Hovercraft extends Vehicle {

    private boolean waterPropulsion; // Water propulsion system e.g., propellers
    private boolean airCushion; // Air cushion system for hovercraft
    private int hovercraftType; // Type of hovercraft e.g., recreational, commercial, military

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
