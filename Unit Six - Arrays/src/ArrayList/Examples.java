package ArrayList;

import java.util.ArrayList;

public class Examples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); 
        list.add("Dev");
        list.add("Ketan");
        list.add("Alex");
        list.add(1, "Joshua");
        String oldString = list.set(0,"Simon");

        System.out.println(list.size());
        System.out.println(oldString + " got replaced.");

        for (String str : list) {
            System.out.println(str);
        }

        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
