package Monsters;

public final class Zombie extends Monster {

    private int decayLevel;
    private boolean missingLimbs;

    public Zombie(String name, int health, int attack, Powers power, int level, int decayLevel, boolean missingLimbs) {
        super(name, health, attack, power, level);
        this.decayLevel = decayLevel;
        this.missingLimbs = missingLimbs;
    }

    public int getDecayLevel(){
        return decayLevel;
    }


    public boolean hasMissingLimbs() {
        return missingLimbs;
    }

    @Override
    public void specialPowers() {
        System.out.println("Zombie activates " + getPower());
    }
}