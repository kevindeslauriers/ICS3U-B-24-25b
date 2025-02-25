package searching;

import java.util.Arrays;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[25];
        initArray(1, 100, arr);
        printArr(arr);
        int index = linearSearch(arr, 23); // try and find 23 in the array
        System.out.println(index);
        Arrays.sort(arr);
        printArr(arr);
        index = binarySearch(arr, 23);
        System.out.println(index);


    }

    private static int binarySearch(int[] arr, int findMe) {
        int minIndex = 0;
        int maxIndex = arr.length-1;
        int midIndex;

        while(minIndex <= maxIndex){
            midIndex = (minIndex + maxIndex) / 2;

            if(arr[midIndex]== findMe)
                return midIndex;
            else if(arr[midIndex] > findMe)
                maxIndex = midIndex - 1;
            else
                minIndex = midIndex + 1;
        }

        return -1;




    }

    /* sometimes called sequential search -> O(n) = n */
    private static int linearSearch(int[] arr, int findMe) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findMe)
                return i;
        }

        return -1;
    }

    private static void printArr(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();
    }

    private static void initArray(int min, int max, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int numOptions = max - min + 1;
            arr[i] = (int) (Math.random() * numOptions) + min;
        }
    }
}
