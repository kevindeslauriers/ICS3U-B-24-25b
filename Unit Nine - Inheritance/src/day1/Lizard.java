package day1;

public class Lizard extends Reptile{
    private boolean canRegrowTail;
    private boolean isDiurnal;
    
    public Lizard(double mass, int age, boolean isAlive, boolean isHungry, String species, boolean isShedding,
            String dietType, boolean canRegrowTail, boolean isDiurnal) {
        super(mass, age, isAlive, isHungry, species, isShedding, dietType, "walking");
        this.canRegrowTail = canRegrowTail;
        this.isDiurnal = isDiurnal;
    }
    public Lizard(double mass, String species, String dietType, boolean canRegrowTail,
            boolean isDiurnal) {
        super(mass, species, dietType, "walking");
        this.canRegrowTail = canRegrowTail;
        this.isDiurnal = isDiurnal;
    }

    

    

}
