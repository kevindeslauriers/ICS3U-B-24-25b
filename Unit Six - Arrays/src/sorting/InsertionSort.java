package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, -2, 5, 10, 72, 10, -5, 17, 10 };

        printArr(arr);
        sort(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;

        }
    }
}
