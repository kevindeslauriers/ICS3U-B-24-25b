package day6;

public class ThingDriverFRQ {
    public static void main(String[] args) {

        Thing snack = new Thing("potato chip");

        Thing favFood = new Thing("pizza");
        favFood.printMessage();

        Thing something = new Thing("ABCD");

        String oldString = something.getName();
        int randomIndex = (int)(Math.random()*oldString.length());  // 0 - length-1
        
        String front = oldString.substring(0, randomIndex);
        String end = oldString.substring(randomIndex+1);

        something.setName(front + end);






    }
}
