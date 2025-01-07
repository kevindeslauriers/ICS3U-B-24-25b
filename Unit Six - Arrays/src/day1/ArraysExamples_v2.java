package day1;

public class ArraysExamples_v2 {
    public static void main(String[] args) {
        // exampleOne();
        // exampleTwo();
        // exampleThree();
        exampleFour();

    }

    private static void exampleFour() {
        String[] strings = {"Hello", "Goodbye", "Cya"};

        // for each -> iterates the array from left to right
        for (String str : strings) {
            System.out.println(str);
        }

        int[] nums = {3,1,7};

        // does not change the array
        for (int i : nums) {
            i *= 3;
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }

    private static void exampleThree() {
        int[] marks = new int[10]; // stores 0 in every element

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println();
        double[] stuff = new double[10]; // stores 0.0 in the elements
        for (int i = 0; i < stuff.length; i++) {
            System.out.println(stuff[i]);
        }

        System.out.println();
        boolean[] isThings = new boolean[10]; // stores false in the elements

        for (int i = 0; i < isThings.length; i++) {
            System.out.println(isThings[i]);
        }
    }

    private static void exampleTwo() {
        double[] values = { 3.5, -1.2, 0.3, 5.9, 9.25 };
        // System.out.println(values[1]); // to access the element use [index]

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }

        System.out.println();

        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + values[i]);
        }

        // modified the array
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                values[i] = Math.abs(values[i]);
            }
        }

        System.out.println();

        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }

    }

    private static void exampleOne() {
        int[] nums = { 6, 2, 1, -4 };
        // nums refers to the array
        // 4 elements in the array
        // length is a property (not a method) of an array

        System.out.println(nums.length); // prints the length (# of elements of an array)

    }
}
