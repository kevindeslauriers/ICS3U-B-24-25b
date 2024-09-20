package day3;

/**
 * ExampleThree
 */
public class ExampleThree {
public static void main(String[] args) {
    int mark1 = 70, mark2 = 96, mark3 = 88;
    double average;
    int numMarks = 3;

    // average = (mark1 + mark2 + mark3) / numMarks;   // widening convesion - Java increased the 
    // System.out.println(average);                    // precision -> implicit cast

    // average = (mark1 + mark2 + mark3) / (double)numMarks;   // widening convesion - we increased the
    // System.out.println(average);                            // the preciaion -> explicit cast
    // numMarks is treated as a double

    // average = (mark1 + mark2 + (double) mark3) / numMarks;
    // System.out.println(average);
    average = (double)(mark1 + mark2 + mark3) / numMarks;
    System.out.println(average);    // 84.666666666667 


    
}
    
}