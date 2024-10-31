package day3;

public class CompoundBooleanExpressions {
    public static void main(String[] args) {
        System.out.println(true && true); // && is and
        System.out.println(true && false);
        System.out.println(false && true); // false && anything is false
        System.out.println(false && false);

        // last two expressions java does not look at the right side of the &&
        // this is called short circuiting

        String str = null;

        // if (str.length() > 0 && str != null){
        // System.out.println(str.length());
        // }

        if (str != null && str.length() > 0){
        System.out.println(str.length());
        }



        boolean hasRedShoes = true;
        int age = 17;

        boolean result = hasRedShoes && age > 18;   // true && false
        System.out.println(result);

        if (hasRedShoes && age < 18){
            System.out.println("This person has red shoes and is less than 18 years old.");
        }
        // prints it because the expressions evaluates to true => true && true

        System.out.println("Or Examples");
        System.out.println(true || true); // || is or  // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        // short circuit when we have true || anything because we no it is true when we see the first true


    }
}
