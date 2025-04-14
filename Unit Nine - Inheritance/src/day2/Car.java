package day2;

public class Car extends Vehicle {
    private String model;

    public Car(String type, String model) {
        super(type); // Calls Vehicle constructor
        this.model = model;
        System.out.println("Car constructor called");
    }

    public void start() {
        super.start(); // Optional: call the parent version first
        System.out.println("Starting the car...");
    }

    public void describe() {
        super.describe(); // Calls Vehicle's describe method
        System.out.println("Model: " + model);
    }
}

