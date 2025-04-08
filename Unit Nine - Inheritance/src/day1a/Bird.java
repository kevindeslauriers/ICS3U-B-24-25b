package day1a;

// First subclass of Animal
public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);  // Call to Animal constructor
        this.canFly = canFly;
        System.out.println("Bird constructor called for " + name);
    }

    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying.");
        } else {
            System.out.println(name + " can't fly.");
        }
    }
}

