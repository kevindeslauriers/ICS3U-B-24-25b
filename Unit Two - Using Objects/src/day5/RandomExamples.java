package day5;

public class RandomExamples {

    public static void main(String[] args) {
        // generates and prints 1000 numbers [0.0,1.0)
        // for (int i = 0; i < 1000; i++) {
        //     System.out.println(Math.random());
        // }


        // generate a number from 1 - 10 inclusive -> integers only
        int num = (int)(Math.random() * 10) + 1;

        // generate a number from -10 to 10 inclusive -> integers only
        int num2 = (int)(Math.random()*21) + -10;

        int min = 8;
        int max = 123;

        // generate a random number from min to max inclusive -> ints only
        for (int i = 0; i < 100000; i++) {
            int num3 = (int)(Math.random() * (max - min + 1)) + min;
            
            if (num3 > max)
                System.out.println("Too Big");
            else if (num3 < min)
                System.out.println("Too Small");
            else if (num3 == min)
                System.out.println(min);
            else if (num3 == max)
                System.out.println(max);
        }


    }
}
