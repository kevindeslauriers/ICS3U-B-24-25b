package day2;

public class CombineArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 7, 9, 11 };
        int[] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };

        int[] combined = merge(arr1, arr2);

        for (int i : combined) {
            System.out.print(i +  " ");
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
                k++;
            }else{
                result[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;


    }
}
