package day1;

public class Examples {

    static long[] solved;
    public static void main(String[] args) {
        // System.out.println(factorialRecursion(7));
        // System.out.println(factorialIterative(7));
        int n = 100;
        solved = new long[n+1];
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n==1 || n==2)
            return 1;
        
        if(solved[n] != 0)
            return solved[n];

        solved[n] = fibonacci(n-1) + fibonacci(n-2);
        return solved[n];
    }

    private static int factorialIterative(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;

    }

    private static int factorialRecursion(int n) {
        if (n == 1) // stopping or base case -> stop the recursive calls
            return 1;

        return n * factorialRecursion(n - 1);
    }
}
