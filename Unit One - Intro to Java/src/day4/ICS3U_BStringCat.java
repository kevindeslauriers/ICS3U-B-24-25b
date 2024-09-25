package day4;

public class ICS3U_BStringCat {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;

        System.out.println(x+y);

        // String concatenation is when you join things together with String
        System.out.println(x + " + " + y + " = " + x + y);          // 7 + 9 = 79
        System.out.println(x + " + " + y + " = " + (x + y));        // 7 + 9 = 16
    
        // anytype + String => String
    }
}
