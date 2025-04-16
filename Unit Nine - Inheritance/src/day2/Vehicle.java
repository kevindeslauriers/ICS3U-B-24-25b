package day2;

public class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called");
    }

    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void describe() {
        System.out.println("This is a " + type);
    }

    public String toString(){
        return type;
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;

        if (!(obj instanceof Vehicle))
            return false;
        
        Vehicle cObj = (Vehicle)obj;

        return cObj.type.equals(this.type);
    }

   
}

