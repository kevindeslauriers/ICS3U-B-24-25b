package day2;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8, 10, 12, 14 };

        int[] result = mergeSortedArrays(a, b);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        // i is index for arr1
        // j is index for arr2
        // k is index for new merged array

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++; 
            }
            k++;
        }

        while (arr1.length != i){
            // copy whats left of arr1 over
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while (arr2.length != j){
            // copy whats left of arr2 over
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }
}
