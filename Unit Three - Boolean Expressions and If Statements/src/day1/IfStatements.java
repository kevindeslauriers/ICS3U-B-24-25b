package day1;

public class IfStatements {
    public static void main(String[] args) {
        boolean hasRedShoes = true;

        // if (hasRedShoes == true){
        // System.out.println("I like your red shoes");
        // }

        if (hasRedShoes) {
            System.out.println("I like your red shoes");
        }

        // if (hasRedShoes == false) {
        // System.out.println("You should buy red shoes. Dorothy did.");
        // }

        if (!hasRedShoes) {
            System.out.println("You should buy red shoes. Dorothy did.");
        }

        int numStudents = 9;
        final int BIG_CLASS = 24;

        if (numStudents >= BIG_CLASS)
            System.out.println("This is a big class. Time to get someone to drop the course.");

        if (numStudents == 3) {
            System.out.println("This is a small class");
            System.out.println("It is really small");
        }

        // if only 1 line in the if statement you do not need { }

    }

}
