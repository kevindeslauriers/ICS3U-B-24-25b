package day1;

public class IfStatements {
    public static void main(String[] args) {
        boolean hasRedShoes = false;

        if (hasRedShoes) {
            System.out.println("Yuo have nice red shoes.");
        }

        if (!hasRedShoes) {
            System.out.println("You should buy some red shoes.");
        }

        // this works but I like above better
        // if (hasRedShoes == false){
        // System.out.println("You should buy some red shoes.");
        // }

        int x = 73;

        if (x % 2 == 0)
            System.out.println("Even");

        if (x % 2 != 0)
            System.out.println("Odd");

        if (x > 10) {
            System.out.println("Hello");
            System.out.println("Hi");
        } // if x > 10 it does 2 things

        if (x > 100)
            System.out.println("Hello...");
        System.out.println("Hi...");

    }

}
