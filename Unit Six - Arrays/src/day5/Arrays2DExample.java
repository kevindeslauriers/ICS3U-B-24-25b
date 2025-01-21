package day5;

public class Arrays2DExample {

    public static void main(String[] args) {
        int[][] nums = new int[4][3];

        print2DArray(nums);
        System.out.println();
        populateArray(nums);
        print2DArray(nums);
        int[] sumRows = rowSum(nums);

        print1DArray(sumRows);

    }

    private static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    private static int[] rowSum(int[][] nums) {
        int[] arr = new int[nums.length];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                arr[row] += nums[row][col];
            }
        }

        return arr;
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
