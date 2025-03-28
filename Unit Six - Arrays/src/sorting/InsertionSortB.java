package sorting;

public class InsertionSortB {
    public static void main(String[] args) {
        int[] arr = { 5, 1, -2, 5, 10, 72, 10, -5, 17, 10 };

        printArr(arr);
        sort(arr);
        printArr(arr);

    }

    private static void Insertion(int[] array){
    	int temp = array[i];
        int j = i;
        
        while (j>0 && array[j-1]>temp){
        	array[j] = array[j-1];
            j--
          } 
            array[j] = temp;
        }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
