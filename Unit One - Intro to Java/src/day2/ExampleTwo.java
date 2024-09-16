package day2;

public class ExampleTwo {
    public static void main(String[] args) {
        int x = 4, y = 7;
        double a = 6.4, b = 7.9;
        double c = 1.0;

        int sum = x + y;       //  sum is assigned x + y
                                // = is the assignment operator

        int p = y % 2;          // remainder (modulus)
        p = y / 2;          // division

        double mult = a * b;        // double * double = double
        x = x - 1;                  // subtracts 1 from x and assigns it back to x


        int numStudents = 14;

        numStudents = numStudents + 1;
        numStudents++;                  // same as numStudents = numStudents + 1;
        numStudents--;                  // same as numStudents = numStudents - 1;

        numStudents += 3;               // same as numStudents = numStudents + 3;

        numStudents -= 2;               // same as numStudents = numStudents - 2;

        double temperature = 12.9;

        temperature *= 2;               // same as temperature = temperature * 2;

        temperature /= 2;               // same as temperature = temperature / 2;

        x %= 2;                         // same as x = x % 2;




    }
}
