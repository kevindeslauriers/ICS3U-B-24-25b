package day1a;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for " + name);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

