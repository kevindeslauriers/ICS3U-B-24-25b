package day2;

public class ObjectToString {
    public static void main(String[] args) {
        Car car1 = new Car("Electric", "Tesla Model S");
        Car car2 = new Car("Electric", "Tesla Model S");
        Car car3 = new Car("Sedan", "Toyota Camry");

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        //System.out.println("Hi".equals(car3));
        
        //System.out.println(car1);
    }
}
