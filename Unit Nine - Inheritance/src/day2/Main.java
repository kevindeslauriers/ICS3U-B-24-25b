package day2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Sedan", "Toyota Camry");
        Car car2 = new Car("Electric Car", "Tesla Model S");
        Car car3 = new Car("Sedan", "Toyota Camry");

        System.out.println("Calling start():");
        car1.start();

        System.out.println("Calling describe():");
        car1.describe();

        // System.out.println(car1 == car2);
        // System.out.println(car1 == car3);
        //System.err.println(car1.equals(car2));
       // System.err.println(car1.equals(car3));

        //System.out.println("Hi".equals("Hi"));

        car2 = car1;
        // System.out.println(car1 == car2);
        //System.err.println(car1.equals(car2));




        //Coffee venti = new Drink(); // not all drinks are coffee
        Drink myCup = new Coffee(); // all coffees are drinks
        venti.setSize("large");

        //System.out.println(car1);
    }
}

