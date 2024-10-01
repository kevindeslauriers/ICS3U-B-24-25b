package day3;

public class Owner {
    private String name;
    private Dog pet;

    public Owner(String name, Dog pet) {
        this.name = name;
        this.pet = pet;
    }

    /**
     * Walks the dog for a specified number of minutes.
     * Precondition: minutes must be a positive integer.
     * Postcondition: A message indicating that the owner is walking the dog for the given minutes will be printed.
     */
    public void walkDog(int minutes) {
        System.out.println(name + " is walking " + pet.getName() + " for " + minutes + " minutes.");
    }

    /**
     * Feeds the dog with the specified food.
     * Precondition: food must be a non-null, non-empty string.
     * Postcondition: A message indicating that the owner is feeding the dog and the dog is eating will be printed.
     */
    public void feedDog(String food) {
        System.out.println(name + " is feeding " + pet.getName() + " " + food + ".");
        pet.eat(food);
    }

    /**
     * Makes the dog bark a specified number of times.
     * Precondition: numberOfBarks must be a positive integer.
     * Postcondition: A message indicating that the dog barked the specified number of times will be printed.
     */
    public void dogBark(int numberOfBarks) {
        pet.bark(numberOfBarks);
    }

    /**
     * Prints the age of the dog.
     * Precondition: None.
     * Postcondition: A message indicating the dog's age will be printed.
     */
    public void printDogAge() {
        System.out.println(pet.getName() + " is " + pet.getAge() + " years old.");
    }
}



