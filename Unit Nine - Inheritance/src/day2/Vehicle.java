package day2;

public class Vehicle {
    private String type;

    public Vehicle(String type) {
        super();
        this.type = type;
        System.out.println("Vehicle constructor called");
    }

    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void describe() {
        System.out.println("This is a " + type);
    }

   
}

