package day5;

public class StaticExample {

    private static int x;
    public static void main(String[] args) {
        x = 7;  // static methods only have access to other static things (attributes and methods in that class)
    }
    }
