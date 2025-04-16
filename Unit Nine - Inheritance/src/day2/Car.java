package day2;

public class Car extends Vehicle {
    private String model;

    public Car(String type, String model) {
        super(type); // Calls Vehicle constructor
        this.model = model;
        System.out.println("Car constructor called");
    }

    // when a child class writes its own version of a method that it inherites
    // from the parent that is called Method Overriding
    // same method name and arguments/parameters  

    
    public void start() {
        super.start(); // Optional: call the parent version first
        System.out.println("Starting the car...");
    }

    // method if not overriddingt a parent method.

    // start() and start(String) are overloaded methods. Two methods with the same
    // name but diofferent parameter lists.
    public void start(String msg){
        super.start();
        System.out.println(msg);
    }

    public void describe() {
        super.describe(); // Calls Vehicle's describe method
        System.out.println("Model: " + model);
    }

    public String toString(){
        return super.toString() + ", " + model;
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;

        if (!(obj instanceof Car))
            return false;
        
        Car cObj = (Car)obj;

        return cObj.model.equals(this.model) && super.equals(cObj);
    }

    
}

