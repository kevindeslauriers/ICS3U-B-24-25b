package day5;

public class Arrays2DExample_v2 {
    public static void main(String[] args) {
        int[][] nums = new int[5][3];
        populate2DArray(nums);

        print2DArray(nums);
        System.out.println();
        System.out.println();

        print1DArray(nums[0]);
    }

    private static void populate2DArray(int[][] arr2D) {
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = (int)(Math.random() * 10) + 1;
            }
            System.out.println();
        }
    }

    private static void print1DArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static void print2DArray(int[][] arr2D) {
        // for (int row = 0; row < arr2D.length; row++) {
        // for (int col = 0; col < arr2D[row].length; col++) {
        // System.out.print(arr2D[row][col] + " ");
        // }
        // System.out.println();
        // }

        for (int[] row : arr2D) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
