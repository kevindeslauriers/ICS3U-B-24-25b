package searching;

import java.util.Arrays;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[25];
        initArray(1, 25, arr);
        printArr(arr);
        int index = linearSearch(arr, 23); // try and find 23 in the array
        System.out.println(index);
        Arrays.sort(arr);
        printArr(arr);
        index = binarySearch1(arr, 23);
        System.out.println(index);

    }

    private static int binarySearch1(int[] arr, int target)
{
	int max = arr.length - 1;
    int min = 0;
    while (max >= min)
    {
    	int mid = (max + min) / 2;
        if (target > arr[mid])
        {
        	min = mid + 1;
        }
        else if (target < arr[mid])
        {
        	max = mid - 1;
        }
        else
        {
        	return mid;
        }
    }
    return -1;
}

    private static int binarySearch(int[] arr, int findMe) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex;

        while (minIndex < maxIndex) {
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

    public static int binarysearch(int[] arr, int findme) {
        int minindex = 0;
        int maxindex = arr.length - 1;
        int midindex;
        while (minindex <= maxindex) {
            midindex = (maxindex - minindex) / 2;
            if (arr[midindex] == findme)
                return midindex;
            else if (arr[midindex] > findme)
                maxindex = midindex - 1;
            else
                minindex = maxindex + 1;
        }
        return -1;
    }

    public static int binarySearch2(int[] arr, int findMe) {
        int min = 0;
        int max = arr.length - 1;
        int mid;
        while (min <= max) {
            mid = (min + max) / 2;

            if (arr[mid] == findMe)
                return mid;
            else if (arr[mid] > findMe)
                max = mid - 1;
            else
                min = mid + 1;
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
