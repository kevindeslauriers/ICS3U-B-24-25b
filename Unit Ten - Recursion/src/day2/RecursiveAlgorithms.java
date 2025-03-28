package day2;

public class RecursiveAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int minIndex = 0;
        int maxIndex = arr.length - 1;
        System.out.println(binarySearch(arr, 23, minIndex, maxIndex));
    }

    private static int binarySearch(int[] arr, int findMe, int minIndex, int maxIndex) {

        if (minIndex > maxIndex)
            return -1;

        int midIndex = (minIndex + maxIndex) / 2;

        if (arr[midIndex] == findMe)
            return midIndex;
        else if (arr[midIndex] > findMe)
            return binarySearch(arr, findMe, minIndex, midIndex - 1);
        else
            return binarySearch(arr, findMe, midIndex + 1, maxIndex);

    }

    private static int binarySearch(int[] arr, int findMe) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex;

        while (minIndex <= maxIndex) {
            midIndex = (minIndex + maxIndex) / 2;

            if (arr[midIndex] == findMe)
                return midIndex;
            else if (arr[midIndex] > findMe)
                maxIndex = midIndex - 1;
            else
                minIndex = midIndex + 1;
        }
        return -1;
    }

}
