package org.example;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String feulType;

    //constructors
    public Vehicle(int numberOfWheels, String color, float engineSize, String feulType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.feulType = feulType;
    }

    // getters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public String getColor() {
        return color;
    }
    public float getEngineSize() {
        return engineSize;
    }
    public String getFeulType() {
        return feulType;
    }

    //setters
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }
    public void setFeulType(String feulType) {
        this.feulType = feulType;
    }

}
