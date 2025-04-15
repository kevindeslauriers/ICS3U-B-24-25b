package day2;

public class Sword extends Weapon{

    public Sword(){
        super(5);
    }

    public int use(){
        System.out.print("You wield your sword and did ");
        int damage = getDamage();
        System.out.println(damage + " damage.");

        return damage;
    }
}
