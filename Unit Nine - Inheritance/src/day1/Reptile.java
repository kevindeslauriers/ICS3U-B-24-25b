package day1;

public class Reptile extends Animal {
    /*
     * If you do not create a constructor, Java will create one for you.
     * A default constructor Reptile(), it will make a call to the parents (super)
     * default constructor. It calls super().
     * 
     * implicit -> Java did it
     * explicit -> you did it.
     * 
     * public Reptile(){
     * super(); --> Animal()
     * }
     */

    private String species;
    private boolean isShedding;
    private String dietType;
    private String modeOfLocomotion;

    public Reptile(double mass, int age, boolean isAlive, boolean isHungry, String species, boolean isShedding,
            String dietType, String modeOfLocomotion) {
        super(mass, age, isAlive, isHungry);
        this.species = species;
        this.isShedding = isShedding;
        this.dietType = dietType;
        this.modeOfLocomotion = modeOfLocomotion;
    }

    public Reptile(double mass, String species, String dietType, String modeOfLocomotion) {
        super(mass);
        this.species = species;
        this.dietType = dietType;
        this.modeOfLocomotion = modeOfLocomotion;
        this.isShedding = false;
    }

    

    /*
    public Reptile() {
      // still not happy because it is trying to call super() and there is no
      // Animal() constructor
    }
    */

    
}
