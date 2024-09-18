package day3;

public class ExampleFive {
    public static void main(String[] args) {
        double x = 7.3;

        //int y = x;  // cannot assign a double to an int

        int y = (int)x;     // explicit cast -> narrowing conversion
        System.out.println(y);
        System.out.println(x);

      



    }
}
