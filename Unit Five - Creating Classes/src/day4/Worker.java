package day4;

public class Worker {
    private int hourlyWage;
    private double hoursWorked;
    private double earnings;
    private static int counter = 0;

    public Worker(int rate, double hoursWorked){
        this.hoursWorked = hoursWorked;
        this.hourlyWage = rate;
    }

    private void calculateEarning(){
        double earnings = 0.0;
        this.earnings = hoursWorked * hourlyWage;
        counter++;
    }

    public double getEarnings(){
        calculateEarning();
        return earnings;
    }

    public static void printCount(){
        System.out.println(counter);
    }
}
