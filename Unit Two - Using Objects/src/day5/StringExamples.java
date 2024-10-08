package day5;

public class StringExamples {
    public static void main(String[] args) {
        // System.out.println("This is a String");
        // int x = 7;
        // int y = 8;

        // System.out.println("Answer is " + x + y);   // Answer is 78
        // // performs String concatenation
        // // anything + a String is a String

        // System.out.println("Answer is " + (x + y)); // Answer is 15

        // String s1 = "Apple";
        // String s2 = "Mango";
        // String s3 = "Apple";
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // s3 = "Orange";
        // System.out.println(s1 + " " + s2 + " " + s3);

        // String str1 = new String("Apple");
        // String str2 = new String("Mango");
        // String str3 = new String("Apple");

        // System.out.println(str1 == str3);   // new creates a new String and the refer to different apples
        // System.out.println(s1 == str1); // compares new String to Literal String (false)

        String message = "AP  COMP  SCI  ROCKS";
        // we can create a Strign literal without a constructor in Java
        System.out.println(message.length()); // 20 -> one bigger than the largest index
        System.out.println(message.indexOf("SCI"));  // 10 -> first occurence
        System.out.println(message.indexOf("sci"));
        




    }
}
