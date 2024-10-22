package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true; // boolean types can hold true or false

        System.out.println(hasRedShoes == false);   
        // hasRedShoes == false is a boolean expression because it 
        // evaluates to true or false (a boolean)

        int age = 23;

        System.out.println(age >= 18);      
        // age >= 18 evaluates to true  - it is also a boolean expression

        /*
         * 
         * >=       greater or equal
         * <=       less or equal
         * ==       equal
         * >        greater
         * <        less
         * !=       not equal
         * !        not  ex. !true => false
        */


        boolean x = age != 18; 
        // x is true

        boolean y = !(7>9);
        // y is true => !(false) = true

        boolean z = !!hasRedShoes;
        
        int a = 7;
        int b = 3;
        boolean test1 = a > 6;
        boolean test2 = b <= 2;
         
        boolean mystery = !test1 == test2;





    }
}
