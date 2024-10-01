package day2;

public class Driver {

    public static void main(String[] args) {
        Student student1;
        Student student2 = new Student("Steve", 21, "1126804", 3.8, "Computer Science", 2027, true);
        Student student3 = new Student("Michelle", 19, "556723", 3.9, "Civil Engineering", 2030, true);

        student1 = student3;

        // System.out.println(student1.name); only have access outside of the class to public stuff

        student2.study(5);  //  to activate (use) methods we use dot operator .
        // does not return anything.

        student1.attendClass("History");
        student3.attendClass("Math");   

        boolean isSmart = student1.isHonors();
        System.out.println("Is the student smart? " + isSmart);

        System.out.println("Is the student smart? " + student2.isHonors());




    }
   
}
