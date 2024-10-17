package day7;

public class Review {
    private static int x;   // static attribute (non-instance attribute / class attribute)
    private int y;          // instance attribute

    public Review(int s, int t){
        Review.x = s;
        this.y = t;
    }

    public void printX(){
        System.out.println(x);
    }

    public void printY(){
        System.out.println(y);
    }

    public void testMe(){
        x = 8;
    }

    public static void testMe2(){
        x = 23;
    }


}
