package sorting;

public class WarmUp {
    public static void main(String[] args) {
        int[] arr = { 5, 1, -2, 5, 10, 72, 10, -5, 17, 10 };

        // return the index of the smallest int
        int index = getSmallest(arr);

        System.out.println(index);
    }

    private static int getSmallest(int[] arr) {
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[smallestIndex])
                smallestIndex = i;
        }

        return smallestIndex;
    }
}
