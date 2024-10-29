package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true;

        System.out.println(hasRedShoes == true); // prints true because T == T is True
        System.out.println(hasRedShoes == false); // prints false because T == F is False

        // = is assignment operator
        // == is equality operator

        int numStudents = 9;

        boolean largeClass = numStudents > 24; // numStudents > 24 is false
        System.out.println("Large Class? " + largeClass); // prints false

        /*
         * == equals
         * > greater than
         * >= greater than or equal
         * < less than
         * <= less than or equal
         * != not equal
         * ! not
         * 
         */

        int x = 27;

        boolean a = x > 10; // a will be true
        boolean b = x <= 10; // b will be false

        boolean c = a == !b; // boolean expression is a == !b
                             // c will be T => T == !F => T == T

        boolean d = !(x <= 10); // !(27 <=10) => !F => T

    }
}
