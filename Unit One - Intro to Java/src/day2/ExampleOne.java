package day2;

public class ExampleOne {
    public static void main(String[] args) {
        final int number = 5000;

        // get the sum of the individual digits in the number
        // use / and %

        int digit1 = number / 1000;         // 6591 / 1000 = 6 (I have 6 thousands)
        int digit2 = number / 100 % 10;     // 6591 / 100 = 65 % 10 = 5
        int digit3 = number / 10 % 10;      // 6591 / 10 = 659 % 10 = 9
        int digit4 = number % 10;           // 6591 % 10 = 1 

        int sum = digit1 + digit2 + digit3 + digit4;

        System.out.println(sum);
    }
}
