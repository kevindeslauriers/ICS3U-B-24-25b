package day1a;

// Subclass of Mammal (multi-level)
public class Dog extends Mammal {
    private String breed;

    public Dog(String name){
        super(name, false);
        this.breed = "Mutt";
    }

    public Dog(String name, String breed) {
        this(name);
        // // test
        // super(name, true);  // Call to Mammal constructor
        this.breed = breed;
        System.out.println("Dog constructor called for " + getName() + " (" + breed + ")");
    }

    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }
}

