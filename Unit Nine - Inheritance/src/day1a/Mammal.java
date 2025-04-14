package day1a;

// Second subclass of Animal
public class Mammal extends Animal {
    private boolean isWarmBlooded;

   /* If you do not write a constructor Java supplies one for you that takes no arguments
    * it does nothing expect call your parents no-argument constructor.

    implicit -> Java did it
    explicit -> you did it

    Java creates this but it won't work
    public Mammal(){
        super();
    }
    */

    public Mammal(String name, boolean isWarmBlooded) {
        super(name);
        this.isWarmBlooded = isWarmBlooded;
        System.out.println("Mammal constructor called for " + getName());
    }

    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}

