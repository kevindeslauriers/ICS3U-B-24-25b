package day2;

public class Weapon {
    private int maxDamage;

    public Weapon(){
        maxDamage = 2;
    }

    public Weapon(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getDamage(){
        return (int)(Math.random()*maxDamage);
    }

    public int use(){
        System.out.print("You used your weapon and did ");
        int damage = getDamage();
        System.out.println(damage + " damage.");

        return damage;
    }


}
