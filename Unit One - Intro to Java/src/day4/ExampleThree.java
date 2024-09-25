package day4;

public class ExampleThree {
    public static void main(String[] args) {
        int num = 4;            // no compile-time errors (no red squiggles)
        int x = 0;

        System.out.println(num / x);    // run-time errors happen when the program is
                                        // running. Java will throw an exception (ie. ArithmeticException)
    }
}
