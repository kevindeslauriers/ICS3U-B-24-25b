package day2;

public class ExampleTwo {
    public static void main(String[] args) {
        int x = 7, y = 8;
        double a = 2.6, b = 0.5;

        x = x + 7;      // 2 things happen (1. adds 7 to x, 2. assigns 14 to x)
                        // assignment is last and has the least precedence

        y += 3;         // this is the same as y = y + 3 (comppund assignment operator)

        b -= 6;         // same as b = b - 6;

        a *= 3;         // same as a = a * 3

        x /= 4;         // 3

        y %= 3;         // 2

        x = y + 3;      // x = 5

        x = x + 1;      // adds 1 to x
        x += 1;         // adds 1 to x
        x++;            // adds 1 to x
        ++x;            // adds 1 to x

        y = x++;        // y is assigned x and then x is incremented
        y = ++x;        // x is incremented and then assigned to y


        y = y - 1;      // subtracts 1 from y
        y -= 1;         // subtracts 1 from y
        y--;            // subtracts 1 from y
        --y;            // subtracts 1 from y

    }
}
