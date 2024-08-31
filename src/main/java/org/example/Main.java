package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(4, "Grey", 7.0f, "Supreme");

        Car car = new Car(8,"Black", 1.0f, "Disel", "Audi");

        //method test
        car.honk();
        car.displayInfo();

        //test getters/setters
        car.setBrand("Honda");
        System.out.println("Updated Brand: " + car.getBrand());

    }
}