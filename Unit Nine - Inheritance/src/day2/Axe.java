package day2;

public class Axe extends Weapon{
    public Axe(){
        super(8);
    }

    public int use(){
        System.out.print("You throw your axe and did ");
        int damage = getDamage();
        System.out.println(damage + " damage.");

        return damage;
    }
}
