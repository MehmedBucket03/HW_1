package org.example;

public class Car extends Vehicle {

    private String brand;

    //constructors
    public Car(int numberOfWheels, String color, float engineSize, String feulType, String brand) {
        //non redundant
        super(numberOfWheels, color, engineSize, feulType);
        this.brand = brand;
    }

    //getters
    public String getBrand() {
        return brand;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //honk method
    public void honk() {
        System.out.println("Honk, honk!");
    }

    //display methd
    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFeulType());
        System.out.println("Brand: " + getBrand());
    }

}
