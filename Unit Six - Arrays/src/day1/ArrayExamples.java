package day1;

public class ArrayExamples {
    public static void main(String[] args) {
        // exampleOne();
        // exampleTwo();
        exampleThree();
    }

    private static void exampleThree() {
        int[] nums = new int[10];

        // for (int el : nums) {
        //     System.out.println(el);
        // }

        // no change because el is a copy of the next element makes a copy of the primitive)
        // for (int el : nums) {
        //     el = (int)(Math.random() * 100) + 5;    // 5 - 104
        // }


        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100) + 5;    // 5 - 104
        }

        for (int el : nums) {
            System.out.println(el);
        }

        // if you are modifying whatyou are iterating through or need the index 
        // use a for loop
    }

    private static void exampleTwo() {
        double[] values = { 4.3, 2.1, -5.4, 9.2 };

        // for loop has access to index and can iterate many ways
        for (int i = 0; i < values.length; i++) {
            System.out.println(i + ": " + values[i]);
        }

        // foreach loop iterates through the whole array starting at the beginnibg
        // no access to the index.
        for (double val : values) {
            System.out.println(val);
        }
    }

    private static void exampleOne() {
        int[] nums = { 7, 5, 4, 3, 1 };

        // nums refers to an array
        // the array contains 5 elements

        // there are no methods for an array
        // index -> 0 .. length - 1
        System.out.println("Length: " + nums.length);

        // length is a property ginving the size of the array.

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[nums.length - 1]); // 5 - 1 = 4

    }
}
