package day6;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);   // == checks the memory location for the variables to see if they are
                                        // same --> does s1 and s2 store the same thing. YES memory location
                                        // to a shared "Hello"

        // only use == to compare primitives not object types

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);       // false because new String() creates a new object for each

        System.out.println(str1.equals(str2));      // true - same sequence of characters

        System.out.println("Hello".compareTo("Hello"));         // 0
        System.out.println("Dev".compareTo("Ian"));             // -5
        System.out.println("Louisa".compareTo("Ian"));          // 3
        System.out.println("Simon".compareTo("Stefano"));       // -11 
        System.out.println("Stefano".compareTo("Simon"));       // 11
        System.out.println("Dog".compareTo("dog"));             // -32

        System.out.println("abcdzz".compareTo("abcdz"));
    }
}
