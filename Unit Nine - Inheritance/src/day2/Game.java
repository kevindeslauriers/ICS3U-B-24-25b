package day2;

public class Game {


    public static void main(String[] args) {
        Weapon weapon = new Weapon();

        weapon.use();

        // polymorphism
        // a single method can work different ways depending on the type of the 
        // object that calls it.

        weapon = new Sword();
        weapon.use();

        weapon = new Axe();
        weapon.use();

        // dynamic binding -> implementation (version of the method) is chosen at runtime.
        
    }
    


}
