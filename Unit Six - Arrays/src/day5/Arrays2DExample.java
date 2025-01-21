package day5;

public class Arrays2DExample {

    public static void main(String[] args) {
        int[][] nums = new int[4][3];

        print2DArray(nums);
        System.out.println();
        populateArray(nums);
        print2DArray(nums);

    }

    private static void print2DArray(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            // prints a row
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void populateArray(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            // prints a row
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = (int) (Math.random() * 10) + 1;
            }
        }

    }
}
