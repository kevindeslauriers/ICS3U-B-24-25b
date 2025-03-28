package day2;

public class RecursiveAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        
        System.out.println(binarySearch(arr, 23));
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
