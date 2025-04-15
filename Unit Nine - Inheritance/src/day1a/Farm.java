package day1a;

public class Farm {
    public static void main(String[] args) {
        Animal animal = new Animal("Ishan");
        Mammal mammal = new Mammal("Brandon", true);
        Dog dog = new Dog("Abraham", "Golden Retriever");
        Bird bird = new Bird("Alex", true);
        Animal animal2 = new Dog("Steve", "Poodle");
        // generic holds specific
        animal.eat();
        mammal.eat();
        mammal.walk();
        dog.bark();
        dog.eat();

        bird.eat();
        bird.fly();

        //animal2.bark();



    }
}
