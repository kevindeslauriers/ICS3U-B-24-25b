package sorting;

public class WarmUpB {
    public static void main(String[] args) {
        int[] arr = { 5, 1, -2, 5, 10, 72, 10, -5, 17, 10 };

        // locate the smallest number (index)

        int minIndex = getSmallestIndex(arr);

        System.out.println(minIndex);

    }

    private static int getSmallestIndex(int[] arr) {
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex])
                minIndex = i;
        }

        return minIndex;
    }
}
