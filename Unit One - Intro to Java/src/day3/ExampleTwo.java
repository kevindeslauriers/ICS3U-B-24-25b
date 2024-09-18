package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        int numStudents = 15;

        numStudents++;
        ++numStudents;

        int y = 10;
        // y = numStudents++;      // uses numStudents then adds 1 to numStudents
        y = ++numStudents;      // adds one to numStudents then uses it
    }
}
