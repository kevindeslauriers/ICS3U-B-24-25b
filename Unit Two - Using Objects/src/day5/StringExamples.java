package day5;

public class StringExamples {
    public static void main(String[] args) {
        // System.out.println("This is a String");
        int x = 7;
        int y = 8;

        // System.out.println("Answer is " + x + y);   // Answer is 78
        // performs String concatenation
        // anything + a String is a String

        // System.out.println("Answer is " + (x + y)); // Answer is 15

        // String s1 = "Apple";
        // String s2 = "Mango";
        // String s3 = "Apple";
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);


       

        // does not place "Happy" in a shared table so it creates 3 "Happy" strings
        // String str1 = new String("Happy");
        // String str2 = new String("Happy");
        // String str3 = new String(str1);

        // System.out.println(str1 == str2);
        // System.out.println(str1 == str3);
        // System.out.println(str2 == str3);

        String message = "AP  COMP  SCI  ROCKS";
        System.out.println(message.length());
        int largestIndex = message.length() - 1;

        int rocks = message.indexOf("ROCKS");
        int sci = message.indexOf("sci");   // returns -1 because -1 cannot be an index and itis not in message

        System.out.println(rocks);

        System.out.println(message.indexOf(" ")); // returns 2 because that is the first occurence

        System.out.println(message.substring(1, 4));    // "P  "

        // 5 charecaters starting at index 10
        String s = message.substring(10, 15);       // "SCI  "

        String s2 = message.substring(10);  // starts at index 10 and goes to the end.

        // last 3 characters of a string 
        String lastThree = message.substring(message.length() - 3); // if length is 20 then 20 - 3 = 17

        




    }
}
