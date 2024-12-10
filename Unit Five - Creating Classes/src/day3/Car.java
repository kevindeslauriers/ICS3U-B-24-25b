package day3;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void setMake(String m) {
        make = m;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public double getMileage() {
        return mileage;
    }

    public void displayCarDetails(){
        String details = "Make: " + make + " Model: " + model + " Year: " + year + " Mileage: " + mileage;
        System.out.println(details);
    }

    public void drive(double milesDriven){
        this.mileage += milesDriven;
        System.out.println("New mileage: " + mileage);
    }  
}
