package ArrayList;

import java.util.ArrayList;

public class Examples2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Henry");
        names.add("Nolan");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        names.add("Alex");

        for (String name : names) {
            System.out.println(name);
        }

        names.add(0, "Ishan");
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

        // names.add(12, "Eric"); // index out of bounds index must be between 0 and size()
        

        String removed = names.remove(2);
        System.out.println();
        System.out.println(removed);
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

        removed = names.set(2, "Caroline");
        System.out.println();
        System.out.println(removed);
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }


    }
}
