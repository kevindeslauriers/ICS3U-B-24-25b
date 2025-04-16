package day3;

public class Student extends Person{
    private int grade;
    private int studentNumber;


    
    public Student(int age, String name, int grade, int studentNumber) {
        super(age, name);
        this.grade = grade;
        this.studentNumber = studentNumber;
    }


    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public boolean equals(Object obj){
        if (super.equals(obj)){
            if (obj instanceof Student){
                return (this.grade == ((Student)obj).grade && this.studentNumber == ((Student)obj).studentNumber);
            }
        }

        return false;
    }

    public String toString(){
        return super.toString() + " who is in grade " + this.grade + " and student number " + this.studentNumber;
    }

    

}
