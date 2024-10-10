package day6;

public class ThingDriverFRQ {
    public static void main(String[] args) {

        Thing something = new Thing("ABCD");



        String oldName = something.getName();
        int index = (int)(Math.random() * oldName.length());
        String newName = oldName.substring(0, index) + oldName.substring(index + 1);
        something.setName(newName);

       






    }
}
