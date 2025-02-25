package sorting;

public class SelectionSortB {
    public static void main(String[] args) {
        int[] arr = { 5, 1, -2, 5, 10, 72, 10, -5, 17, 10 };

        printArr(arr);
        sort(arr);
        // printArr(arr);

    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // when there is one left its the biggest
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            printArr(arr);
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
