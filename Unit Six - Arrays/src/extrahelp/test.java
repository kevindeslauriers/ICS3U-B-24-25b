package extrahelp;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        for (Dog d : dogs) {
            System.out.println(d);
        }

        for (Dog d : dogs) {
            d.increntAge();
        }

        for (Dog d : dogs) {
            System.out.println(d);
        }

        // for(Dog d : dogs){
        //     dogs.remove(d);
        // }

        for (int i = 0; i < dogs.size(); i++) {
            dogs.remove(i);
        }

    }

}
