package ArrayList;

import java.util.ArrayList;

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Henry");
        names.add("Nolan");

        for (String name : names) {
            System.out.println(name);
        }


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }



        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(12);

        for (Integer num : numbers) {
            System.out.println(num);
        }

        ArrayList stuff = new ArrayList();

        stuff.add(7);
        stuff.add("Happy");
        stuff.add(new Frog());

        ((Frog)stuff.get(1)).jump();




        
    }
}
