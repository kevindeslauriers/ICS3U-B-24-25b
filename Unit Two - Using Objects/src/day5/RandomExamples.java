package day5;

public class RandomExamples {

    public static void main(String[] args) {
        // generates and prints 1000 numbers [0.0,1.0)
        // for (int i = 0; i < 1000; i++) {
        //     System.out.println(Math.random());
        // }


        // generate a number from 1 - 10 inclusive -> integers only
        // for (int i = 0; i < 1000; i++) {
        //     int x = (int)(Math.random()*10) + 1;
        //     System.out.println(x);
        // }
        // generate a number from -10 to 10 inclusive -> integers only
        // for (int i = 0; i < 1000; i++) {
        //     int x = (int)(Math.random()*21) - 10;
        //     System.out.println(x);
        // }
        int min = -5;
        int max = 6;

        // generate a random number from min to max inclusive -> ints only
        for (int i = 0; i < 1000; i++) {
            int x = (int)(Math.random()*(max-min+1)) + min;
            System.out.println(x);
        }


    }
}
