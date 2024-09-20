package day3;

/**
 * ExampleFive
 */
public class ExampleFive {
    public static void main(String[] args) {
        double x = 7;           // widening conversion int -> double
                                // implicit cast

        double a = (double) 4 / 3;  // explicit cast and widening conversion
        System.out.println(a);   
        
        a = (double) (4 / 3);
        System.out.println(a);

        //int z = 8.9;            // Java does not perform implicit narrowing conversions

        int z = (int)8.9;       // We can perform an explicit narrowing coversion

        //double n = (double)false;       // Cannot cast from boolean to double





    }
    
}