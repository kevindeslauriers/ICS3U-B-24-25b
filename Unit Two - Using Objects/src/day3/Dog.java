package day3;
public class Dog {
    private String name;
    private int age;

    public Dog(String dogsName, int dogsAge) {
        name = dogsName;
        age = dogsAge;
    }

    /**
     * Makes the dog bark a specified number of times.
     * Precondition: numberOfBarks must be a positive integer.
     * Postcondition: The dog's name and "Woof!" will be printed numberOfBarks times.
     */
    public void bark(int numberOfBarks) {
        for (int i = 0; i < numberOfBarks; i++) {
            System.out.println(name + " says: Woof!");
        }
    }

    /**
     * Feeds the dog with the specified food.
     * Precondition: food must be a non-null, non-empty string.
     * Postcondition: A message indicating that the dog is eating the food will be printed.
     */
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    /**
     * Makes the dog sleep for a specified number of hours.
     * Precondition: hours must be a positive integer.
     * Postcondition: A message indicating that the dog is sleeping for the given hours will be printed.
     */
    public void sleep(int hours) {
        System.out.println(name + " is sleeping for " + hours + " hours.");
    }

    /**
     * Gets the age of the dog.
     * Precondition: None.
     * Postcondition: The dog's age will be returned.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the name of the dog.
     * Precondition: None.
     * Postcondition: The dog's name will be returned.
     */
    public String getName() {
        return name;
    }
}




