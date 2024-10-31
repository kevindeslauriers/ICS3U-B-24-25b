package day3;

public class MoreAdvancedExample {
    public static void main(String[] args) {
        int age = 17;
        boolean hasRedShoes = true;
        int x = 5;

        boolean result = (x > 6) && !hasRedShoes || (age <= 18);

        // false && false || true
        // false || true
        // true

        System.out.println(result);

        int a = 7;
        int b = 10;
        int c = 12;

        boolean result1 = (a > 7) && ((b % 2 == 0) || (c > 10));
        // false && (true || true)
        // false && true
        // false
        System.out.println(result1);

        if (!(a % 2 == 0)) {
            System.out.println("Hi");
            if (b == 10)
                System.out.println("B");
            else
                System.out.println("C");
        } else if (c > 10 && b != 5)
            System.out.println("D");
    }

    // prints:
    // Hi
    // B


}
