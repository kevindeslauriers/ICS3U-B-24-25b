package day3;

public class ExampleFour {
public static void main(String[] args) {
    int mark1 = 87, mark2 = 97, mark3 = 63;
    int numMarks = 3;

    // explicit cast on numMarks to convert to a double temporary
    // double average = (mark1 + mark2 + mark3) / (double)numMarks;    // 82.33333
    // double average = (mark1 + mark2 + (double)mark3) / numMarks;    // 82.33333
    // double average = (double)(mark1 + mark2 + mark3) / numMarks;   // 82.33333
    double average = (double)((mark1 + mark2 + mark3) / numMarks);  //useless explicit cast // 82.0
    average = (mark1 + mark2 + mark3) / numMarks;    // same as above but this is implicit 

    System.out.println(average);
}
}
