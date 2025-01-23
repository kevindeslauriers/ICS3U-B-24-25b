package extrahelp;

public class ExtraHelp {
    public static void main(String[] args) {
        int[][] grid = { { 7, 4, 3 },
                { 2, 1, 6 },
                { 9, 5, 4, },
                { 3, 1, 0 } };

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[] sumRows = new int[grid.length];

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                sumRows[r] += grid[r][c];
            }
        }

        for (int el : sumRows) {
            System.out.print(el + " ");
        }

        System.out.println();
        int[] sumCols = new int[grid[0].length];

        for (int c = 0; c < grid[0].length; c++) {
            sumCols[c] = getSum(grid, c);
        }

        for (int el : sumCols) {
            System.out.print(el + " ");
        }

    }

    private static int getSum(int[][] grid, int col) {
       int sum = 0;

       for (int r = 0; r < grid.length; r++) {
            sum += grid[r][col];
       }

       return sum;
    }
}
