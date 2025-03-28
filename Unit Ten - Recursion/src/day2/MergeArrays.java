package day2;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8, 10 };

        int[] result = mergeSortedArrays(a, b);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] a, int[] b) {

    }
}
