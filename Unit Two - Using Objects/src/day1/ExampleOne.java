package day1;

public class ExampleOne {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Coco", 7, "Toy Poodle", 15.3);

        dog1.bark();    // activate the bark method
        dog1.eat("Steak");

        Swim swimmer = new Swim();
        swimmer.dive();
    }
}
