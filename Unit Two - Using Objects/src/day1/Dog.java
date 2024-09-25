package day1;

public class Dog {
    // Data members
    private String name;
    private int age;
    private String breed;
    private double weight;
    private boolean isVaccinated;

    // Constructor
    public Dog(String name, int age, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.isVaccinated = false; // default value
    }

    // Methods
    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void updateVaccinationStatus(boolean status) {
        this.isVaccinated = status;
        System.out.println(name + " vaccination status updated to: " + (status ? "Vaccinated" : "Not Vaccinated"));
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Weight: " + weight + " kg, Vaccinated: " + (isVaccinated ? "Yes" : "No");
    }

    public void celebrateBirthday() {
        age++;
        System.out.println(name + " has turned " + age + " years old!");
    }

    public boolean isPuppy() {
        return age < 1;
    }
}
