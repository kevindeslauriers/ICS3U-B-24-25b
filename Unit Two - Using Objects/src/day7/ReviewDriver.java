package day7;

public class ReviewDriver {
    

    public static void main(String[] args) {
        Review r1 = new Review(5, 6);
        Review r2 = new Review(9, 8);
        

        r1.printX();
        r2.printX();

        r1.printY();
        r2.printY();

        r1.testMe();
        r2.printX();
        Review.testMe2();
        r1.printX();


        Review r3 = new Review(0, 0);
        r1.printX();
    }
}
