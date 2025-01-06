package day4;

public class Driver {
    public static void main(String[] args) {
        Worker w1 = new Worker(20, 15);
        Worker w2= new Worker(10, 12);

        w1.getEarnings();
        w2.getEarnings();

        Worker.printCount();



    }
}
