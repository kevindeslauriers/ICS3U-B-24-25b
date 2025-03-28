package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 1, -2, 5, 10, 72, 10, -5, 17, 10 };

        printArr(arr);
        sortA(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void sort2(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int j = i;

            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];

                j--;

            }

            arr[j] = temp;

        }

    }

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;

        }
    }

    private static void sort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = arr[i];
            int j = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[j];
            arr[j] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }

    private static void sortA(int[] arr)
{
	for (int i = 1; i < arr.length; i++)
    {
    	int j = i;
        int temp = arr[i];
        while (j > 0 && temp < arr[j-1])
        {
        	arr[j] = arr[j-1];
            j--;
        }
        arr[j] = temp;
    }
}

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] < temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
