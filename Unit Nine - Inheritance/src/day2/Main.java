package day2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", "Toyota Camry");

        System.out.println("Calling start():");
        car.start();

        System.out.println("Calling describe():");
        car.describe();
    }
}

