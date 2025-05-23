package extrahelp;

public class Dog {
    private int age;

    public Dog(){
        this.age = 0;
    }

    public void increntAge(){
        this.age++;
    }

    public String toString(){
        return "" + this.age;
    }
}
