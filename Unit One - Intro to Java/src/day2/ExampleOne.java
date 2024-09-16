package day2;

public class ExampleOne {
    public static void main(String[] args) {
        // add the digits from a four digit number

        int number = 4753;

        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;     // 4753 / 100 = 47, 47 % 10 = 7
        int digit3 = number / 10 % 10;      // 4753 / 10 = 475, 475 % 10 = 5
        int digit4 = number % 10;

        System.out.println(digit1 + digit2 + digit3 + digit4);

        // prints out 19 --> 4 + 7 + 5 + 3




    }
}
