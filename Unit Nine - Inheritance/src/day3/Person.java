package day3;

public class Person extends Object{
    private int age;
    private String name;
    
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj){

        if (obj == null) return false;

        if (obj instanceof Person){
            return (this.age == ((Person)obj).age && this.name == ((Person)obj).name);
        }

        return false;
    }

    public String toString(){
        return this.name + " is " + this.age + " years old";
    }
}
