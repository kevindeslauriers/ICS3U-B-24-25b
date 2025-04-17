package day3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(16, "Arees");
        Person person2 = new Person(20, "Veronica");
        Person person3 = new Person(16, "Arees");

        Student student1 = new Student(16, "Arees", 10, 27081);
        Student student2 = new Student(16, "Arees", 10, 27082);
       
        // person1.equals(person3);

        // System.out.println(student1.equals(person1));

        System.out.println(person1);

        System.out.println(student1);


    }
}
