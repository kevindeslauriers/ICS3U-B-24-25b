package day1;

public class Examples_v2 {

    static long[] solutions;

    public static void main(String[] args) {
        // System.out.println(recursiveFactorial(7));
        System.out.println(iterativeFactorial(7));
        int n = 150;
        solutions = new long[n + 1];
        System.out.println(fibonacci(n));
    }

   

    

    private static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;

        if (solutions[n] != 0)
            return solutions[n];

        solutions[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return solutions[n];
    }

    private static int recursiveFactorial(int n) {
        if (n == 1)
            return 1;

        return n * recursiveFactorial(n - 1);
    }

    private static int iterativeFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= 7; i++) {
            result *= i;
        }
        return result;
    }

}
